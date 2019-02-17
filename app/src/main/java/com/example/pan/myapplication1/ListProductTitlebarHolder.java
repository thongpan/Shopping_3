package com.example.pan.myapplication1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ListProductTitlebarHolder extends RecyclerView.ViewHolder {
    public TextView textTitleBar;
    public Button buttonTitleBar;
    public RecyclerView recyclerView;

    public ListProductTitlebarHolder(View view){
        super(view);

        textTitleBar = (TextView)view.findViewById(R.id.text_titlebar);
        buttonTitleBar = (Button)view.findViewById(R.id.button_titlebar);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview_listproducthoz);

    }
}
