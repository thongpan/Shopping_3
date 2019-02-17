package com.example.pan.myapplication1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListProductTitlebar2Holder extends RecyclerView.ViewHolder {
    public TextView textTitleBar;
    public Button buttonTitleBar;
    public RecyclerView recyclerView;

    public ListProductTitlebar2Holder(View view){
        super(view);

        textTitleBar = (TextView)view.findViewById(R.id.text_titlebar2);
        buttonTitleBar = (Button)view.findViewById(R.id.button_titlebar2);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview_listproducthoz2);

    }
}
