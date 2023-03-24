package com.icky.wsi4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.icky.wsi4.R;

public class TugasActivity extends AppCompatActivity {
    private Button btnLv;
    private Button btnRv;
    private Button btnFr;
    private Button btnIn;
    private Button btnSv;
    private Button btnCam;
    private Button btnLog;
    private Button btnReg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
        btnLv = findViewById(R.id.btn_lv);
        btnRv = findViewById(R.id.btn_rv);
        btnFr = findViewById(R.id.btn_fr);
        btnIn = findViewById(R.id.btn_in);
        btnSv = findViewById(R.id.btn_sv);
        btnCam = findViewById(R.id.btn_cam);
        btnLog = findViewById(R.id.btn_log);
        btnReg = findViewById(R.id.btn_reg);

        // Set click listener for ListView
        btnLv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, ListCountryActivity.class);
                startActivity(intent);
            }
        });
        // Set click listener for RecyclerView
        btnRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, ListCountryActivity.class);
                startActivity(intent);
            }
        });
        btnFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, IntentImplicitActivity.class);
                startActivity(intent);
            }
        });
        btnSv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, ScrollViewActivity.class);
                startActivity(intent);
            }
        });
        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, ScrollViewActivity.class);
                startActivity(intent);
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TugasActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
