package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.retrofit.GET.GetActivity;
import com.example.retrofit.PATH.PathActivity;
import com.example.retrofit.QUERY.QueryActivity;
import com.example.retrofit.QUERYMAP.QueryMapActivity;

public class MainActivity extends AppCompatActivity {


    Button btnGet,btnQuery,btnQueryMap,btnPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGet = findViewById(R.id.btnGet);
        btnQuery = findViewById(R.id.btnQuery);
        btnQueryMap = findViewById(R.id.btnQueryMap);
        btnPath = findViewById(R.id.btnPath);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GetActivity.class));
            }
        });
        btnQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QueryActivity.class));
            }
        });
        btnQueryMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QueryMapActivity.class));
            }
        });
        btnPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PathActivity.class));
            }
        });
    }
}