package com.example.pan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class PagerAdapterSlideHomepageFragment  extends FragmentPagerAdapter {
    public PagerAdapterSlideHomepageFragment(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return Slide1HomepageFragment.newInstance(null, null);
        } else if (position == 1) {
            return Slide2HomepageFragment.newInstance(null, null);
        } else if (position == 2) {
            return Slide3HomepageFragment.newInstance(null, null);
        } else if (position == 3) {
            return Slide4HomepageFragment.newInstance(null, null);
        }

        return null;
}
        /*switch (position){
            case 0: return Slide1HomepageFragment.newInstance(null, null);
            case 1: return Slide2HomepageFragment.newInstance(null, null);
            case 2: return Slide3HomepageFragment.newInstance(null, null);
            case 3: return Slide4HomepageFragment.newInstance(null, null);
        }
        return null;*/




    @Override
    public CharSequence getPageTitle(int position){
        CharSequence[] pageTitles = {"Page1", "Page2"};
        return pageTitles[position];
    }

}
