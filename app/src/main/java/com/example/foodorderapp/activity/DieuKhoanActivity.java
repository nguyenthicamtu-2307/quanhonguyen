package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.adapter.LichSuDonHangAdapter;
import com.example.foodorderapp.model.LichSuDonHang;

import java.util.ArrayList;


public class DieuKhoanActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dieukhoan);

    }
}

