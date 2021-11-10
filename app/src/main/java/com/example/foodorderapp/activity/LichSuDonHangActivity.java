package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.adapter.LichSuDonHangAdapter;
import com.example.foodorderapp.model.LichSuDonHang;

import java.util.ArrayList;


public class LichSuDonHangActivity  extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        lvContact = (ListView) findViewById(R.id.lvLichSuDonHang);
        ArrayList<LichSuDonHang> ArrLS = new ArrayList<>();

        LichSuDonHang ls1 = new LichSuDonHang(R.drawable.ts,"Trà sữa 1", 23000);
        LichSuDonHang ls2 = new LichSuDonHang(R.drawable.ts,"Trà sữa 2", 30000);


        ArrLS.add(ls1);
        ArrLS.add(ls2);


        LichSuDonHangAdapter customAdaper = new LichSuDonHangAdapter(this,R.layout.row_lichsudonhang,ArrLS);
        lvContact.setAdapter(customAdaper);
    }
}

