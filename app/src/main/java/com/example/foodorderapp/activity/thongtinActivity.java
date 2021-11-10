package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.adapter.MonAdapter;
import com.example.foodorderapp.adapter.MonGHAdapter;
import com.example.foodorderapp.adapter.ttadapter;
import com.example.foodorderapp.model.MonGH;
import com.example.foodorderapp.model.listtt;

import java.util.ArrayList;
import java.util.List;

public class thongtinActivity extends AppCompatActivity {
    ttadapter ttadapter;
    private List<listtt> MonList;
    private ListView lvContact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtin);
        lvContact = (ListView) findViewById(R.id.ttgh);

        Anhxa();
        ttadapter= new ttadapter(this,R.layout.mon_thongtin,MonList);
        lvContact.setAdapter(ttadapter);

    }
    private void Anhxa (){

        MonList = new ArrayList<>();
        MonList.add(new listtt("Trà sữa khoai môn","25000","2",R.drawable.ts1));
        MonList.add(new listtt("Bánh mì bơ tỏi","25000","2",R.drawable.banhmibotoi));

    }
}
