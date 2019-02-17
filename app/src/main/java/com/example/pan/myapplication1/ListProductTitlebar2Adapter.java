package com.example.pan.myapplication1;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListProductTitlebar2Adapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList mItems;

    public ListProductTitlebar2Adapter(Context context, ArrayList<ListProduct2Item> items){

        mContext = context;
        mItems = items;
    }

    @Override
    public int getItemCount(){
        return mItems.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        final RecyclerView.ViewHolder viewHolder;
        final View view = inflater.inflate(R.layout.list_product_titlebar2,parent,false);
        viewHolder = new ListProductTitlebar2Holder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){

            ListProductTitlebar2Item item = (ListProductTitlebar2Item)mItems.get(position);
            ListProductTitlebar2Holder titlebarHolder = (ListProductTitlebar2Holder)viewHolder;
            titlebarHolder.textTitleBar.setText(item.textTitleBar);
            titlebarHolder.buttonTitleBar.setRawInputType(item.buttonTitleBar);

            HozListProduct2Adapter hAdapter = new HozListProduct2Adapter(mContext, item.hozItems);
            titlebarHolder.recyclerView.setAdapter(hAdapter);
            /*titlebarHolder.recyclerView.setLayoutManager(new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false));*/
            titlebarHolder.recyclerView.setLayoutManager(new GridLayoutManager(mContext,2));



    }
}
