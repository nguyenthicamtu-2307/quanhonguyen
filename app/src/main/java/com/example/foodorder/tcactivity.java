package com.example.giaodien;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.giaodien.R;
import com.example.giaodien.myadaptor;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class tcactivity extends AppCompatActivity {
    private ViewPager mview;
    private BottomNavigationView btnview;
    private  ViewPager mv;
    private CircleIndicator mcr;
  private myadaptor adapdor;
  private List<Photo> mlistphoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpaker);
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
                        break;
                    case R.id.donhang:
                        mview.setCurrentItem(1);
                        break;
                    case R.id.tichdiem:
                        mview.setCurrentItem(2);
                        break;
                    case R.id.person:
                        mview.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });
    }
}
