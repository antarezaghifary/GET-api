package id.azer.listdataapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiService apiService;
    ListDataAdapter listPembayaranAdapter;
    RecyclerView rv_satu;
    Object list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = RetrofitApiClient.getRetrofit().create(ApiService.class);
        rv_satu = findViewById(R.id.rv_data);
        showData();
    }

    private void showData() {
        Call<Object> call = apiService.pembayaran();
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.isSuccessful()) {
                    if (response.code() == 200){
                        String jsonData = response.body().toString();
                        Log.d("",""+jsonData);
                        JSONObject jsonObject = null;
                        JSONArray jsonObject1;
                        try {
                            jsonObject1 = new JSONArray(new Gson().toJson(response.body()));
                            Log.d("Respon", "data pembayaran dua :  " + jsonObject1);

                            //untuk menampilkan di recyclerview

                            for(int i=0;i<jsonObject1.length();i++){
                                JSONObject json_data = jsonObject1.getJSONObject(i);
                                id.azer.listdataapi.Response fishData = new id.azer.listdataapi.Response();
                                json_data.getString("arti");
                                json_data.getString("nama");
                                listPembayaranAdapter = new ListDataAdapter(Collections.singletonList((id.azer.listdataapi.Response) fishData));
                                LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                                rv_satu.setLayoutManager(layoutManager);
                                rv_satu.setAdapter(listPembayaranAdapter);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();

                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {

            }
        });
    }
}