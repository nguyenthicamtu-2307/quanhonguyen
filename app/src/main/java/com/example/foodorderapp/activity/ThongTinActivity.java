package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListViewGiohang.MonGH;
import com.example.foodorderapp.activity.ListViewGiohang.MonGHAdapter;
import com.example.foodorderapp.adapter.thongtinadapter;
import com.example.foodorderapp.model.modeltt;

import java.util.ArrayList;
import java.util.List;

public class ThongTinActivity extends AppCompatActivity {
    MonGHAdapter ttadapter;
    private List<MonGH> MonList;
    private ListView lvContact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtin);

        Anhxa();
        ttadapter= new MonGHAdapter(this,R.layout.mon_thongtin,MonList);
        lvContact.setAdapter(ttadapter);

    }
    private void Anhxa (){
        lvContact = (ListView) findViewById(R.id.ttgh);
        MonList = new ArrayList<>();
        MonList.add(new MonGH("Trà sữa khoai môn","25000","2",R.drawable.ts1));
        MonList.add(new MonGH("Bánh mì bơ tỏi","25000","2",R.drawable.banhmibotoi));

    }
}
