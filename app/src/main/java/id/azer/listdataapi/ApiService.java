package id.azer.listdataapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/84a768d2ded86014ed69")
    Call <Object> pembayaran();
}
