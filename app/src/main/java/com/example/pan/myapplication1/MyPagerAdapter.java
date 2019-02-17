package com.example.pan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
       public  int getCount(){
        return 2;
    }

    @Override
        public Fragment getItem(int position){
           switch (position){
               case 0:return MyFragmant.newInstance(null, null);
               case 1:return MyFragmant1.newInstance(null, null);
               default: return null;
           }
    }

    @Override
        public CharSequence getPageTitle(int position){
        CharSequence[] pageTitles = {"Page1", "Page2"};
        return pageTitles[position];
    }
}
