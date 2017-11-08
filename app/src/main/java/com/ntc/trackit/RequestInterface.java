package com.ntc.trackit;

import com.ntc.trackit.models.ServerRequest;
import com.ntc.trackit.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("Trackit/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
