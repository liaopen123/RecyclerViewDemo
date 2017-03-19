package com.example.liaopenghui.recyclerviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.liaopenghui.recyclerviewdemo.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public ArrayList<String> lists =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        initData();
    }

    private void initData() {
        for(int i=0;i<20;i++){
            lists.add("这是第"+i+"个数据");
        }
    }
}
