package com.icky.wsi4.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.icky.wsi4.MahasiswaAdapter;
import com.icky.wsi4.Models.Mahasiswa;
import com.icky.wsi4.R;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private List<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);


        // inisialisasi data mahasiswa
        mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Irfan", "123456", "Teknik Informatika"));
        mahasiswaList.add(new Mahasiswa("Icky", "234567", "Sistem Informasi"));
        mahasiswaList.add(new Mahasiswa("Zedsin", "345678", "Teknik Elektro"));
        mahasiswaList.add(new Mahasiswa("Aldy", "345678", "Teknik Listrik"));

        // inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // inisialisasi adapter
        adapter = new MahasiswaAdapter(mahasiswaList);
        recyclerView.setAdapter(adapter);
    }
}