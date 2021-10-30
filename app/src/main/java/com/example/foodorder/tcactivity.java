package com.example.foodorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.foodorder.R;
import com.example.foodorder.myadaptor;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class tcactivity extends AppCompatActivity {
    private ViewPager mview;
    private BottomNavigationView btnview;
    private ViewPager mv;
    private CircleIndicator mcr;
    Button coffe;
    private myadaptor adapdor;
    private photoadaptor ptadap;
    private List<photo> mlistphoto;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpaker);



        mv =findViewById(R.id.sline_view);
        mcr=findViewById(R.id.cirle_view);
        ptadap=new photoadaptor(this,getlist());
        mv.setAdapter(ptadap);
        mcr.setViewPager(mv);
        ptadap.registerDataSetObserver(mcr.getDataSetObserver());

        mview = findViewById(R.id.viewper);
        btnview = findViewById(R.id.menubar);
        adapdor = new myadaptor(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mview.setAdapter(adapdor);

        mview.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        btnview.getMenu().findItem(R.id.main).setChecked(true);
                        break;
                    case 1:
                        btnview.getMenu().findItem(R.id.donhang).setChecked(true);
                        break;
                    case 2:
                        btnview.getMenu().findItem(R.id.tichdiem).setChecked(true);
                        break;
                    case 3:
                        btnview.getMenu().findItem(R.id.person).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.main:
                        mview.setCurrentItem(0);
                        mview.setVisibility(View.VISIBLE);
                        btnview.setVisibility(View.VISIBLE);
                        mcr.setVisibility(View.VISIBLE);
                        mv.setVisibility(View.VISIBLE);



                        break;
                    case R.id.donhang:
                        mview.setCurrentItem(1);
                        mview.setVisibility(View.VISIBLE);
                        btnview.setVisibility(View.GONE);
                        mcr.setVisibility(View.VISIBLE);
                        mv.setVisibility(View.GONE);

                        break;
                    case R.id.tichdiem:
                        mview.setCurrentItem(2);
                        mview.setVisibility(View.VISIBLE);
                        btnview.setVisibility(View.VISIBLE);
                        mcr.setVisibility(View.GONE);
                        mv.setVisibility(View.GONE);

                        break;
                    case R.id.person:
                        mview.setCurrentItem(3);
                        mview.setVisibility(View.VISIBLE);
                        btnview.setVisibility(View.VISIBLE);
                        mcr.setVisibility(View.GONE);
                        mv.setVisibility(View.GONE);

                        break;
                }
                return true;
            }
        });


    }

    private List<photo> getlist(){
        List<photo>  list =new ArrayList<>();
        list.add(new photo(R.drawable.h1));
        list.add(new photo(R.drawable.h3));
        list.add(new photo(R.drawable.h2));
        return list;
    }
}
