package com.example.retrofit.QUERYMAP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.retrofit.R;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QueryMapActivity extends AppCompatActivity {

    TextView tvKetqua;
    String data="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_map);
        tvKetqua = findViewById(R.id.tvKetqua);

        QueryMap_callApi();
    }

    private void QueryMap_callApi() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("name","meelad");
        ApiGetDataModel2.apiGetDataModel2.getDataModel2(stringMap).enqueue(new Callback<Model2>() {
            @Override
            public void onResponse(Call<Model2> call, Response<Model2> response) {

                Model2 model2 = response.body();
                data = data
                        +"age: "+model2.getAge()+"\n"
                        +"count: "+model2.getCount()+"\n"
                        +"name: "+model2.getName()+"\n";

                tvKetqua.setText(data);

            }

            @Override
            public void onFailure(Call<Model2> call, Throwable t) {

            }
        });
    }
}