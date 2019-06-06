package com.example.onlineshoping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Array extends AppCompatActivity {
    ListView Lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        Lv=(ListView)findViewById(R.id.list);
        ArrayList<String>myli=new ArrayList<>();
        myli.add("choes");
        myli.add("computers");
        myli.add("phones");
        myli.add("cars");
        myli.add("bycles");
        myli.add("cerealas");
        myli.add("oils");
        ArrayAdapter<String>adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        Lv.setAdapter(adapter);
    }
}
