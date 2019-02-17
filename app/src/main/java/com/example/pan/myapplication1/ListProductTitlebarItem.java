package com.example.pan.myapplication1;

import java.util.ArrayList;
import java.util.List;

public class ListProductTitlebarItem {
    public String textTitleBar;
    public int buttonTitleBar;
    public ArrayList<ListProduct1Item> hozItems;

    public ListProductTitlebarItem(String textTitleBar, int buttonTitleBar, ArrayList<ListProduct1Item> hozitems){

        this.textTitleBar = textTitleBar;
        this.buttonTitleBar = buttonTitleBar;
        this.hozItems = hozitems;
    }
}
