package ir.akhbar;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsListServer {

    @GET("bins/1ghoqu")
    public Call<ServerResponse> getNewsList();

}
