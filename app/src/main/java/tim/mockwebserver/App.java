package tim.mockwebserver;

import android.app.Application;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    public static Retrofit.Builder retrofit = new Retrofit.Builder();

    public static OkHttpClient client;

    public static String BASE_URL = "http://etickettest.omg.com.tw/api/";

    //singleton
    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        init();
    }

    public static App getInstance() {
        return mInstance;
    }

    private void init() {
        client = new OkHttpClient.Builder().build();
    }

    public static Retrofit.Builder post() {

        return retrofit.addConverterFactory(GsonConverterFactory.create()).client(App.client);
    }

}
