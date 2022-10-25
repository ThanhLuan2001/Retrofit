package com.example.retrofit.QUERY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QueryActivity extends AppCompatActivity {

    TextView tvKetqua;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        tvKetqua = findViewById(R.id.tvKetqua);

        Query_CallApi();
    }

    private void Query_CallApi() {
        ApiGetDataAdress.apiGetDataAdress.getDataAdress("nathaniel")
                .enqueue(new Callback<Adress>() {
                    @Override
                    public void onResponse(Call<Adress> call, Response<Adress> response) {
                        Adress adress = response.body();
                        List<Country> list = adress.getCountry();
                        for (int i=0;i<list.size();i++){
                            Country country = list.get(i);
                            data = data
                                    +"country_id: "+country.getCountry_id()+"\n"
                                    +"probability: "+country.getProbability()+"\n";
                        }

                        data += "name: "+adress.getName();


                        tvKetqua.setText(data);
                    }

                    @Override
                    public void onFailure(Call<Adress> call, Throwable t) {

                        Toast.makeText(QueryActivity.this, "Call thất bại", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}