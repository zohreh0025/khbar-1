package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private TextView title;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
    }

    public void bind(String titleText) {
        title.setText(titleText);
    }
}
