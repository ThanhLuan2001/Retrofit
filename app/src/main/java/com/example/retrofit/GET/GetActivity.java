package com.example.retrofit.GET;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetActivity extends AppCompatActivity {

    TextView tvKetqua;
    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        tvKetqua = findViewById(R.id.tvKetqua);
        callApi();
    }

    private void callApi() {
        Call<Model1> call = ApiGetDataModel.apiGetDataModel.getDataModel();
        call.enqueue(new Callback<Model1>() {
            @Override
            public void onResponse(Call<Model1> call, Response<Model1> response) {
                Model1 model1 = response.body();

                data = data
                        +"activity: "+model1.getActivity()+"\n"
                        +"type: "+model1.getType()+"\n"
                        +"participants: "+model1.getParticipants()+"\n"
                        +"price: "+model1.getPrice()+"\n"
                        +"link: "+model1.getLink()+"\n"
                        +"key: "+model1.getKey()+"\n"
                        +"accessibility: "+model1.getAccessibility()+"\n";
                tvKetqua.setText(data);


            }

            @Override
            public void onFailure(Call<Model1> call, Throwable t) {

                Toast.makeText(GetActivity.this, "Call thất bại", Toast.LENGTH_SHORT).show();
            }
        });

    }
}