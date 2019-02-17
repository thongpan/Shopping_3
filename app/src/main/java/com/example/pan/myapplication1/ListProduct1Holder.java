package com.example.pan.myapplication1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListProduct1Holder extends RecyclerView.ViewHolder {
    public ImageView imageListProduct1;
    public TextView productNameListProduct1, productPriceListProduct1;

    public ListProduct1Holder(View view){
        super(view);

        imageListProduct1 = (ImageView)view.findViewById(R.id.image_listproduct1);
        productNameListProduct1 = (TextView)view.findViewById(R.id.productname_listproduct1);
        productPriceListProduct1 = (TextView)view.findViewById(R.id.productprice_listproduct1);
    }
}
