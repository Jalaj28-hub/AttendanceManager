package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
private Button scanqr,generateqr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        scanqr=findViewById(R.id.IdBtnScanner);
        generateqr=findViewById(R.id.IdBtnGenerater);
        scanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(HomeActivity.this,ScanQRActivity.class);
                startActivity(in);
            }
        });
        generateqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent in = new Intent(HomeActivity.this,GenerateQRActivity.class);
               startActivity(in);
               finish();
            }
        });
    }
}