package com.example.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button btndn;
    Button btndk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btndn=(Button) findViewById(R.id.button);
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Intent intent=new Intent(MainActivity.this, tcactivity.class);
=======
                Intent intent=new Intent(MainActivity.this, com.example.giaodien.tcactivity.class);
>>>>>>> cc51fde1f13d50af87c57db9d2b9cbbcc863ea4d
                startActivity(intent);
            }
        });
    }
}