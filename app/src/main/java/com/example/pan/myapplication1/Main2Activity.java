package com.example.pan.myapplication1;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rd.PageIndicatorView;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Main2Activity extends AppCompatActivity {

    Button manu, empty_cart, sceenbarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);*/
        /*setSupportActionBar(toolbar);*/

        ArrayList hozitems = new ArrayList();
        ArrayList hozitems1 = new ArrayList();
        ArrayList veritems = new ArrayList() ;
        ArrayList veritems1 = new ArrayList() ;
        ArrayList veritems2 = new ArrayList() ;

        veritems.add(new ListProductTitlebarItem("สินคใหม่",R.id.button_titlebar, hozitems));
        hozitems.addAll(Arrays.asList(
                  new ListProduct1Item(R.drawable.empty_cart,"ทีวี", "฿5,000.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"แว่นตา","฿500.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"แว่นตา","฿500.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"แว่นตา","฿500.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"โคมไฟ","฿3,000.00")));

        veritems.add(new ListProductTitlebarItem("สินคยอดนิยม",R.id.button_titlebar, hozitems1));
        hozitems1.addAll(Arrays.asList(
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อ","฿550.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อ","฿550.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อ","฿550.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อ","฿550.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อ","฿550.00"),
                  new ListProduct1Item(R.drawable.empty_cart,"เสื้อแขนยาว","฿1,500.00")));

        veritems1.add(new ListProductTitlebar2Item("ตัวอย่างสินค้า",R.id.button_titlebar2, veritems2));
        veritems2.addAll(Arrays.asList(
                  new ListProduct2Item(R.drawable.empty_cart,"ทีวี","ทีวีสีจอแบน","฿20,000.00"),
                  new ListProduct2Item(R.drawable.empty_cart,"กระติกนำ้าร้อน","ต้มนำ้ให้ร้อน","฿500.00"),
                  new ListProduct2Item(R.drawable.empty_cart,"โน๊ตบุ๊ค","พิมพ์รายงาน","฿50,000.00"),
                  new ListProduct2Item(R.drawable.empty_cart,"โน๊ตบุ๊ค","พิมพ์รายงาน","฿50,000.00"),
                  new ListProduct2Item(R.drawable.empty_cart,"คอมพิวส์เตอร์ตั้งโต๊ะ","พิมพ์รายงาน","฿70,000.00")));

        ListProductAdapter adapter1 = new ListProductAdapter(this, veritems);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview_listproduct);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        ListProductTitlebar2Adapter adapter2 = new ListProductTitlebar2Adapter(this, veritems1);
        RecyclerView recyclerView2 = (RecyclerView)findViewById(R.id.recyclerview_listproduct2);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));


       PagerAdapterSlideHomepageFragment adapter = new PagerAdapterSlideHomepageFragment(getSupportFragmentManager());
        final ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager1);
        viewPager.setAdapter(adapter);

        PageIndicatorView pageIndicatorView = (PageIndicatorView)findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(viewPager);



        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        /*final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar,0,0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/



        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.nav_photo) {
                            /*String str = "photo";
                            Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();*/
                        }
                        drawer.closeDrawer(GravityCompat.START);
                        return true;
                    }

                });


        manu = (Button) findViewById(R.id.manu);
        empty_cart = (Button) findViewById(R.id.empty_cart) ;
        sceenbarcode = (Button) findViewById(R.id.sceenbarcode);

        manu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               drawer.openDrawer(GravityCompat.START);

                /*String str = "manu";
                Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();*/
            }
        });

        empty_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "empty_cart";
                Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        sceenbarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "sceenbarcode";
                Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();
            }
        });


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
