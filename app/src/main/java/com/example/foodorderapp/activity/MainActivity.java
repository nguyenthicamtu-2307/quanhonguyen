package com.example.foodorderapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.foodorderapp.R;
import com.example.foodorderapp.fragment.Cartfragment;
import com.example.foodorderapp.fragment.TDfragment;
import com.example.foodorderapp.fragment.WishlistFragment;
import com.example.foodorderapp.fragment.homefragment;
import com.example.foodorderapp.fragment.personfragment;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Timer mtime;
    private ImageView next;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        mtime=new Timer();
        mtime.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,main.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}