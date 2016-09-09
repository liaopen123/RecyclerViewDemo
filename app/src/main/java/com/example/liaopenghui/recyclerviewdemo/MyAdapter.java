package com.example.liaopenghui.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by liaopenghui on 16/9/9.
 */
public class MyAdapter extends RecyclerView.Adapter {
    private final Context context;
    private final ArrayList<String> lists;

    public MyAdapter(Context context, ArrayList<String> lists) {
        this.context= context;
        this.lists = lists;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
