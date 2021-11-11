package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListViewGiohang.MonGH;
import com.example.foodorderapp.activity.ListViewGiohang.MonGHAdapter;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;
import com.example.foodorderapp.adapter.thongtinadapter;
import com.example.foodorderapp.model.modeltt;

import java.util.ArrayList;
import java.util.List;

public class LSDQ extends AppCompatActivity {
    thongtinadapter lsdqadapter;
    private List<modeltt> list;
    private ListView lvContact,lv2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lsdq);
        Anhxa();
        Anhxa1();
        lsdqadapter= new thongtinadapter(this,R.layout.mon_doimon,list);
        lvContact.setAdapter(lsdqadapter);
        lv2.setAdapter(lsdqadapter);
    }
    private void Anhxa (){
        lvContact = (ListView) findViewById(R.id.lv1);
        list = new ArrayList<>();
        list.add(new modeltt("Trà sữa khoai môn","25000",R.drawable.ts1));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
    }
    private void Anhxa1 (){
        lv2 = (ListView) findViewById(R.id.lv2);
        list = new ArrayList<>();
        list.add(new modeltt("Trà sữa khoai môn","25000",R.drawable.ts1));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
        list.add(new modeltt("Bánh mì bơ tỏi","25000",R.drawable.banhmibotoi));
    }
}
