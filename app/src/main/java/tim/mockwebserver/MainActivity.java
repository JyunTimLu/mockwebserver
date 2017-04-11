package tim.mockwebserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }

    private void loadData() {
        APIServices services = App.post().baseUrl(App.BASE_URL).build().create(APIServices.class);
        Call<BaseResponse<TicketModel>> call = services.getTicketList();
        call.enqueue(new Callback<BaseResponse<TicketModel>>() {
            @Override
            public void onResponse(Call<BaseResponse<TicketModel>> call, Response<BaseResponse<TicketModel>> response) {
                if (response.body().isSuccess()) {
                    onDataLoaded(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<TicketModel>> call, Throwable t) {
            }
        });
    }

    private void onDataLoaded(List<TicketModel> ticketModelList) {
        for (TicketModel ticketModel : ticketModelList) {
            Log.d("TAG", ticketModel.getItemName());
        }
    }
}
