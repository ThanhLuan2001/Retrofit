package com.example.retrofit.QUERYMAP;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiGetDataModel2 {

    //link api:https://api.agify.io/?name=meelad//name là key và meelad là value
    ApiGetDataModel2 apiGetDataModel2 = new Retrofit.Builder()
            .baseUrl("https://api.agify.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiGetDataModel2.class);

    @GET("/?")
    Call<Model2> getDataModel2(@QueryMap Map<String,String> stringMap);
}
