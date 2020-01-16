package ir.akhbar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Networking {

    private NewsListServer server;

    public Networking() {
        OkHttpClient client2 = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client2)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.myjson.com/")
                .build();

        server = retrofit.create(NewsListServer.class);
    }

    public void getNewsList() {
        server.getNewsList()
                .enqueue(new Callback<ServerResponse>() {
                    @Override
                    public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                        ServerResponse serverResponse = response.body();
                        for (int i = 0; i < serverResponse.getRoot().size(); i++) {
                            System.out.println("Title: " + serverResponse.getRoot().get(i).getNewsTitle());
                            System.out.println("Description: " + serverResponse.getRoot().get(i).getNewsDescription());
                        }
                    }

                    @Override
                    public void onFailure(Call<ServerResponse> call, Throwable t) {

                    }
                });
    }
}
