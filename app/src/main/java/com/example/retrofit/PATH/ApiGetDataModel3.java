package com.example.retrofit.PATH;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiGetDataModel3 {

    //link api :https://api.github.com/users/5
    ApiGetDataModel3 apiGetDataModel3 = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiGetDataModel3.class);

    @GET("/users/{id}")
    Call<Model3> getDataModel3(@Path("id")int id);
}
