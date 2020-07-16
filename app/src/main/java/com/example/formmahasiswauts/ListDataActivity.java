package com.example.formmahasiswauts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListDataActivity extends AppCompatActivity {

    RecyclerView rvData;
    ArrayList<ModelMahasiswa> mhs;
    ListDataAdapter adapter;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        rvData = findViewById(R.id.rv_list_data);

        dbHelper = new DBHelper(getApplicationContext());
        mhs = dbHelper.getAllRecord();

        adapter = new ListDataAdapter(mhs, getApplicationContext());
        rvData.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvData.setAdapter(adapter);
    }
}
