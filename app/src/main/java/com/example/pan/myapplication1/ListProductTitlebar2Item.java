package com.example.pan.myapplication1;

import java.util.ArrayList;

public class ListProductTitlebar2Item {
    public String textTitleBar;
    public int buttonTitleBar;
    public ArrayList<ListProduct2Item> hozItems;

    public ListProductTitlebar2Item(String textTitleBar, int buttonTitleBar, ArrayList<ListProduct2Item> items){

        this.textTitleBar = textTitleBar;
        this.buttonTitleBar = buttonTitleBar;
        this.hozItems = items;
    }
}
