package com.example.retrofit.GET;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiGetDataModel {

    //link api : https://www.boredapi.com/api/activity
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.boredapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    ApiGetDataModel apiGetDataModel = retrofit.create(ApiGetDataModel.class);

    @GET("/api/activity")
    Call<Model1> getDataModel();
}
