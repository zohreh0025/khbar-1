package ir.akhbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_news_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView newsRecycler = (RecyclerView) view.findViewById(R.id.newsRecycler);
        newsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        Networking networking = new Networking();
        networking.getNewsList();

        /*NewsAdapter adapter = new NewsAdapter(newsArray, new NewsItemClickListener() {
            @Override
            public void onClick(NewsData data) {
                Bundle bundle = new Bundle();
                bundle.putString("newsTitle", data.getNewsTitle());
                bundle.putString("newsDescription", data.getNewsDescription());
                bundle.putString("newsImage", data.getNewsImage());
                NewsDetailFragment detailFragment = new NewsDetailFragment();
                detailFragment.setArguments(bundle);
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.fragmentContainer, detailFragment)
                        .commit();
            }
        });
        newsRecycler.setAdapter(adapter);*/
    }
}
