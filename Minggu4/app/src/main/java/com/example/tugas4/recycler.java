package com.example.tugas4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recycler extends AppCompatActivity {

    private RecyclerView recyclerView;
    //    RecyclerViewAdapter adapter;
    int[] img;
    String[] title;
    String[] desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recycler_view);

        img = new int[]{
                R.drawable.ijen,
                R.drawable.wurung,
                R.drawable.bromo,
                R.drawable.pasir,
                R.drawable.teluk,
                R.drawable.pandawa,
        };
        title = getResources().getStringArray(R.array.title);

        desc = getResources().getStringArray(R.array.desc);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, img, title, desc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}