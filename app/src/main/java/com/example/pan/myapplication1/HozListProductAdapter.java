package com.example.pan.myapplication1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class HozListProductAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList mItems;

    public HozListProductAdapter(Context context, ArrayList<ListProduct1Item> items){

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
        final View view = inflater.inflate(R.layout.list_product1, parent, false);
        viewHolder = new ListProduct1Holder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){
        ListProduct1Item item = (ListProduct1Item) mItems.get(position);
        ListProduct1Holder product1Holder = (ListProduct1Holder)viewHolder;
        product1Holder.imageListProduct1.setImageResource(item.imageListProduct1);
        product1Holder.productNameListProduct1.setText(item.productNameListProduct1);
        product1Holder.productPriceListProduct1.setText(item.productPriceListProduct1);
    }
}
