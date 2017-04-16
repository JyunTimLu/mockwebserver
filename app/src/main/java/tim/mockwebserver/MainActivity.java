package tim.mockwebserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements APILoadData {

    private LoadTicketListSubscriber loadTicketListSubscriber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }

    private void loadData() {
        APIServices services = App.post().baseUrl(App.BASE_URL).build().create(APIServices.class);
        loadTicketListSubscriber = new LoadTicketListSubscriber(this);
        Observable<BaseResponse<TicketModel>> observable = services.getTicketList();
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(loadTicketListSubscriber);
    }


    @Override
    public void onDataLoaded(Object data) {

        for (Object o : (ArrayList<?>) data) {
            if (o instanceof TicketModel) {
                Log.d("TAG", ((TicketModel) o).getItemName());
            }
        }

    }


    private class LoadTicketListSubscriber extends Subscriber<BaseResponse<TicketModel>> {

        private APILoadData apiLoadData;

        LoadTicketListSubscriber(APILoadData apiLoadData) {
            this.apiLoadData = apiLoadData;
        }

        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(BaseResponse<TicketModel> response) {
            if (response.isSuccess()) {
                apiLoadData.onDataLoaded(response.getData());
            }
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (loadTicketListSubscriber != null && !loadTicketListSubscriber.isUnsubscribed()) {
            loadTicketListSubscriber.unsubscribe();
        }
    }
}
