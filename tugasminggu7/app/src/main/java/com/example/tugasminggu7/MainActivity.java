package com.example.tugasminggu7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {
    String[] daftar;
    ListView Listview01;
    Menu menu;
    protected Cursor cursor;
    DataHelper dbcenter;
    public static MainActivity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View arg0() {
                // TODO Auto-generated method stub
                Intent inte = new Intent( packageContext:MainActivity.this, BuatBiodata.class);
                startActivity(inte);
            }
        });
    ma = this;
    dbcenter = new DataHelper(context this);
    RefreshList();
    }

public void RefreshList () {
        SQLiteDatabase db= dbcenter.getReadableDatabase();
        cursor =db.rawQuery ( sql: "SELECT * FROM biodata", selectionArgs:null);
        daftar =new String[cursor.getCount()];
        cursor.moveToFirst();

   for (int cc=0; cc < cursor.getCount(); cc++){
       cursor.moveToPosition(cc);
       daftar[cc] cursor.getString (i: 1).toString ();

   ListView01 = (ListView)findViewById(R.id.Listview1);
   ListView01.setAdapter (new ArrayAdapter( context:this, android.R.Layout.simple_List_Item_1,daftar));
   listView01.setSelected(true);
   Listview01.setOnItemClickListener(new OnItemClickListener() {
