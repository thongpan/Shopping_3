package com.example.pan.myapplication1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListProduct2Holder extends RecyclerView.ViewHolder {
    public ImageView imageListProduct2;
    public TextView productNameListProduct2, titleProductListProduct2, productPriceListProduct2;

    public ListProduct2Holder(View view){
        super(view);

        imageListProduct2 = (ImageView)view.findViewById(R.id.image_listproduct2);
        productNameListProduct2 = (TextView)view.findViewById(R.id.productname_listproduct2);
        titleProductListProduct2 = (TextView)view.findViewById(R.id.titleproduct_listproduct2);
        productPriceListProduct2 = (TextView)view.findViewById(R.id.productprice_listproduct2);
    }
}
