package id.azer.listdataapi;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClient {
    private static final String BASE_URL = "https://api.npoint.io/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        String url = BASE_URL;
        Log.d("URLAPI", "" + url);
        client.connectTimeout(15, TimeUnit.SECONDS);
        client.writeTimeout(15, TimeUnit.SECONDS);
        client.readTimeout(15, TimeUnit.SECONDS);

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } else {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
