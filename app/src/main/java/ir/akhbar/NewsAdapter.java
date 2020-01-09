package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_new_list, parent, false);
        NewsViewHolder viewHolder = new NewsViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.bind("Fire in Austrlia " + String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
