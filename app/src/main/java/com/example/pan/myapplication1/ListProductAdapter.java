package com.example.pan.myapplication1;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListProductAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private ArrayList mItems;
    private final int LISTPRODUCTTITLEBAR_ITEM = 0;
    private final int LISTPRODUCT2_ITEM = 2;
    private boolean mIsFirstChild = true;

    public ListProductAdapter(Context context, ArrayList<ListProduct1Item> items){

        mContext = context;
        mItems = items;
    }

    @Override
    public int getItemCount(){
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position){
        if (mItems.get(position) instanceof ListProductTitlebarItem){
            return LISTPRODUCTTITLEBAR_ITEM;

        }else if (mItems.get(position) instanceof ListProduct2Item){
            return LISTPRODUCT2_ITEM;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        final RecyclerView.ViewHolder viewHolder;
        if (viewType == LISTPRODUCTTITLEBAR_ITEM){
            final View view = inflater.inflate(R.layout.list_product_titlebar,parent,false);
            viewHolder = new ListProductTitlebarHolder(view);
            return viewHolder;

        }else if (viewType == LISTPRODUCT2_ITEM){
            final View view = inflater.inflate(R.layout.list_product2,parent,false);
            viewHolder = new ListProduct2Holder(view);
            return viewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){
        int type = getItemViewType(position);
        if (type == LISTPRODUCTTITLEBAR_ITEM){
            ListProductTitlebarItem item = (ListProductTitlebarItem)mItems.get(position);
            ListProductTitlebarHolder titlebarHolder = (ListProductTitlebarHolder)viewHolder;
            titlebarHolder.textTitleBar.setText(item.textTitleBar);
            titlebarHolder.buttonTitleBar.setRawInputType(item.buttonTitleBar);

            HozListProductAdapter hAdapter = new HozListProductAdapter(mContext, item.hozItems);
            titlebarHolder.recyclerView.setAdapter(hAdapter);
            titlebarHolder.recyclerView.setLayoutManager(new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false));

        }else if (type == LISTPRODUCT2_ITEM){
            ListProduct2Item item = (ListProduct2Item)mItems.get(position);
            ListProduct2Holder product2Holder = (ListProduct2Holder)viewHolder;
            product2Holder.imageListProduct2.setImageResource(item.imageListProduct2);
            product2Holder.productNameListProduct2.setText(item.productNameListProduct2);
            product2Holder.titleProductListProduct2.setText(item.titleProductListProduct2);
            product2Holder.productPriceListProduct2.setText(item.productPriceListProduct2);

        }


    }


}
