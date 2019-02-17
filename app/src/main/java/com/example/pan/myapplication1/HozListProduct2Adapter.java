package com.example.pan.myapplication1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class HozListProduct2Adapter extends RecyclerView.Adapter<ListProduct2Holder> {

    private Context mContext;
    private List<ListProduct2Item> mItems;

    public HozListProduct2Adapter(Context context, List<ListProduct2Item> items){
        mContext = context;
        mItems = items;
    }

    @Override
    public int getItemCount(){
        return mItems.size();
    }

    @Override
    public ListProduct2Holder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        final View view = inflater.inflate(R.layout.list_product2,parent,false);
        return new ListProduct2Holder(view);
    }

    @Override
    public void onBindViewHolder(final ListProduct2Holder vHolder,int position){
        ListProduct2Item item = mItems.get(position);
        vHolder.imageListProduct2.setImageResource(item.imageListProduct2);
        vHolder.productNameListProduct2.setText(item.productNameListProduct2);
        vHolder.titleProductListProduct2.setText(item.titleProductListProduct2);
        vHolder.productPriceListProduct2.setText(item.productPriceListProduct2);
    }

}
