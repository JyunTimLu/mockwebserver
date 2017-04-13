package tim.mockwebserver;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Tim on 2017/4/11.
 */

public interface APIServices {

    @GET("ticket")
    Observable<BaseResponse<TicketModel>> getTicketList();
}
