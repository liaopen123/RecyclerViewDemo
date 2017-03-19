package com.example.liaopenghui.recyclerviewdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.liaopenghui.recyclerviewdemo.GalleryAdapter;
import com.example.liaopenghui.recyclerviewdemo.R;
import com.example.liaopenghui.recyclerviewdemo.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.Arrays;

public class HorizontalRecyclerView extends AppCompatActivity {

    private ArrayList<Integer> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_recycler_view);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        //设置布局管理器
        initDatas();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.addItemDecoration(new SpacesItemDecoration(2));
        //设置适配器
        GalleryAdapter mAdapter = new GalleryAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initDatas()
    {
        mDatas = new ArrayList<Integer>(Arrays.asList(R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher));
    }


}
