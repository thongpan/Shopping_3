package com.example.pan.myapplication1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    final MyFragmant f = new MyFragmant();
    final MyFragmant1 f1 = new MyFragmant1();

    Button sw , sw1, bu, bu1, bu2;

    /*private void replaceFragment(MyFragmant1 fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        final ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(pagerAdapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {

                    Drawable under = getResources().getDrawable(R.drawable.group6);
                    sw.setBackground(under);

                    int color1 = getResources().getColor(R.color.sw);
                    sw.setTextColor(color1);

                    int under3 = getResources().getColor(R.color.bu);
                    sw1.setBackgroundColor(under3);

                    int color3 = getResources().getColor(R.color.color);
                    sw1.setTextColor(color3);

                    String srt = "sw";
                    Toast.makeText(getBaseContext(), srt, Toast.LENGTH_SHORT).show();


                }else {
                        Drawable under1 = getResources().getDrawable(R.drawable.group6);
                        sw1.setBackground(under1);

                        int color = getResources().getColor(R.color.sw);
                        sw1.setTextColor(color);

                        int under2 = getResources().getColor(R.color.bu);
                        sw.setBackgroundColor(under2);

                        int color2 = getResources().getColor(R.color.color);
                        sw.setTextColor(color2);

                    String srt = "sw1";
                    Toast.makeText(getBaseContext(), srt, Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        sw1 = (Button) findViewById(R.id.sw1);
        sw1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                pager.setCurrentItem(1);

                /*getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, f1)
                        .commit();*/

                Drawable under1 = getResources().getDrawable(R.drawable.group6);
                sw1.setBackground(under1);

                int color = getResources().getColor(R.color.sw);
                sw1.setTextColor(color);

                int under2 = getResources().getColor(R.color.bu);
                sw.setBackgroundColor(under2);

                int color2 = getResources().getColor(R.color.color);
                sw.setTextColor(color2);

                String srt = "sw1";
                Toast.makeText(getBaseContext(), srt, Toast.LENGTH_SHORT).show();
            }

        });
        sw = (Button) findViewById(R.id.sw);
        sw.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {

                pager.setCurrentItem(0);

                /*getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, f)
                        .commit();*/

                Drawable under = getResources().getDrawable(R.drawable.group6);
                sw.setBackground(under);

                int color1 = getResources().getColor(R.color.sw);
                sw.setTextColor(color1);

                int under3 = getResources().getColor(R.color.bu);
                sw1.setBackgroundColor(under3);

                int color3 = getResources().getColor(R.color.color);
                sw1.setTextColor(color3);

                String srt = "sw";
                Toast.makeText(getBaseContext(), srt, Toast.LENGTH_SHORT).show();
            }

        });

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
        /*switch (position) {
        case 0: Drawable under = getResources().getDrawable(R.drawable.group6);
        sw.setBackground(under);

        int color1 = getResources().getColor(R.color.sw);
        sw.setTextColor(color1);

        int under3 = getResources().getColor(R.color.bu);
        sw1.setBackgroundColor(under3);

        int color3 = getResources().getColor(R.color.color);
        sw1.setTextColor(color3);

        case 1: Drawable under1 = getResources().getDrawable(R.drawable.group6);
        sw1.setBackground(under1);

        int color = getResources().getColor(R.color.sw);
        sw1.setTextColor(color);

        int under2 = getResources().getColor(R.color.bu);
        sw.setBackgroundColor(under2);

        int color2 = getResources().getColor(R.color.color);
        sw.setTextColor(color2);*/