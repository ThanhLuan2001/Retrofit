package com.example.retrofit.PATH;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.retrofit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PathActivity extends AppCompatActivity {

    EditText edID;
    Button btnGetData;
    TextView tvKetqua;
    String data = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);

        edID = findViewById(R.id.edtID);
        btnGetData = findViewById(R.id.btnGetData);
        tvKetqua = findViewById(R.id.tvKetqua);

        btnGetData.setOnClickListener(view -> {
            int id = Integer.parseInt(edID.getText().toString());
            Path_callApi(id);
        });
        

    }

    private void Path_callApi(int id) {
        ApiGetDataModel3.apiGetDataModel3.getDataModel3(id).enqueue(new Callback<Model3>() {
            @Override
            public void onResponse(Call<Model3> call, Response<Model3> response) {
                Model3 model3 = response.body();
                tvKetqua.setText(
                        "login: "+model3.getLogin()+"\n"
                        +"id: "+model3.getId()+"\n"
                        +"name: "+model3.getName()+"\n");
            }

            @Override
            public void onFailure(Call<Model3> call, Throwable t) {

            }
        });
    }

}