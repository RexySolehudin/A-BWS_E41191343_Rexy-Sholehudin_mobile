package com.example.tugas4;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] title;
    String[] desc;
    String[] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        title = new String[]{
                "Kawah Ijen",
                "Kawah Wurung",
                "Gunung Bromo",
                "Pasir Putih",
                "Teluk Love",
                "Pantai Pandawa"
        };
        desc = new String[]{
                getResources().getString(R.string.desc_kawah_ijen),
                getResources().getString(R.string.desc_kawah_wurung),
                getResources().getString(R.string.desc_bromo),
                getResources().getString(R.string.desc_pasir_putih),
                getResources().getString(R.string.desc_teluk_love),
                getResources().getString(R.string.desc_pandawa),
        };
        img = new String[]{
                Integer.toString(R.drawable.ijen),
                Integer.toString(R.drawable.wurung),
                Integer.toString(R.drawable.bromo),
                Integer.toString(R.drawable.pasir),
                Integer.toString(R.drawable.teluk),
                Integer.toString(R.drawable.pandawa),
        };

        mylist = new ArrayList<HashMap<String, String>>();

        for(int i = 0; i < title.length; i++){
            map = new HashMap<String, String>();
            map.put("title", title[i]);
            map.put("desc", desc[i]);
            map.put("img", img[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this,
                mylist,
                R.layout.activity_list_item,
                new String[] {"title", "desc", "img"},
                new int[]{R.id.tv_title, R.id.tv_desc, R.id.img_thumbnail}
        );

        listView.setAdapter(adapter);
    }
}