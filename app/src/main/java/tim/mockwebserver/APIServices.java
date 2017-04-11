package tim.mockwebserver;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Tim on 2017/4/11.
 */

public interface APIServices {

    @GET("ticket")
    Call<BaseResponse<TicketModel>> getTicketList();
}
