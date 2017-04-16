package tim.mockwebserver;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Tim on 2017/4/13.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<TicketModel> ticketModelList;

    public Adapter(List<TicketModel> ticketModelList) {
        this.ticketModelList = ticketModelList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ticketModelList.size();
    }
}
