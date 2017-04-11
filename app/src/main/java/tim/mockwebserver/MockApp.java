package tim.mockwebserver;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

public class MockApp extends App {

    private MockWebServer mockWebServer;

    @Override
    public void onCreate() {
        super.onCreate();

        mockWebServer = new MockWebServer();
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    mockWebServer.start();
                    BASE_URL = mockWebServer.url("/").toString();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        mockWebServer.setDispatcher(new MyDispatcher());
    }

    private static class MyDispatcher extends Dispatcher {

        @Override
        public MockResponse dispatch(RecordedRequest request) throws InterruptedException {
            if ("/ticket".equals(request.getPath())) {
                return getMockResponse(200, "ticket_200_ok_response.json");
            }
            return new MockResponse();
        }

        private MockResponse getMockResponse(int statusCode, String fileName) {
            try {
                return new MockResponse()
                        .setResponseCode(statusCode)
                        .setBody(getFileFromPath(fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        private String getFileFromPath(String fileName) throws Exception {
            InputStream is = MockApp.getInstance()
                    .getAssets()
                    .open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            return new String(buffer, "UTF-8");
        }
    }
}
