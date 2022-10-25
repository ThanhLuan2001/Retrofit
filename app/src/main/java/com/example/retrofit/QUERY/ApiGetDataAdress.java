package com.example.retrofit.QUERY;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiGetDataAdress {


    //link api: https://api.nationalize.io/?name=nathaniel
    ApiGetDataAdress apiGetDataAdress = new Retrofit.Builder()
            .baseUrl("https://api.nationalize.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiGetDataAdress.class);

    @GET("/?")
    Call<Adress> getDataAdress(@Query("name")String name);
    //ở đây sẽ là lấy về đối tượng adress chứ k phải list adress nha
    //xin lỗi mình bị nhầm xíu
    //sang bên main sửa lại nha
}

