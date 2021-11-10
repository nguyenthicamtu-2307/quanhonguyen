package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListViewGiohang.MonGH;
import com.example.foodorderapp.activity.ListViewGiohang.MonGHAdapter;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;

import java.util.ArrayList;

public class GioHangActivity extends AppCompatActivity {
    ListView lvmonGH;
    ArrayList<MonGH> arraymonGH;
    MonGHAdapter monGHAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giohang);
        Button buton11= (Button) findViewById(R.id.btnDathang_Giohang);
        Anhxa();
        monGHAdapter = new MonGHAdapter(this,R.layout.dongmon_giohang,arraymonGH);
        lvmonGH.setAdapter(monGHAdapter);



    }
    private void Anhxa (){
        lvmonGH =(ListView) findViewById(R.id.LvGiohang);
        arraymonGH = new ArrayList<>();
        arraymonGH.add(new MonGH("Trà sữa khoai môn","25000","2",R.drawable.ts1));
        arraymonGH.add(new MonGH("Bánh mì bơ tỏi","25000","2",R.drawable.banhmibotoi));
        arraymonGH.add(new MonGH("Bánh Kem Socola","25000","2",R.drawable.banhkemscola));
        arraymonGH.add(new MonGH("Bánh mì thịt","25000","2",R.drawable.banhmithit));
        arraymonGH.add(new MonGH("MatCha","25000","2",R.drawable.matcha));
        arraymonGH.add(new MonGH("Cafe Cappucino","25000","2", R.drawable.cafe_cappuccino));
        arraymonGH.add(new MonGH("Bánh Panta","25000","2", R.drawable.banhpanta));
        arraymonGH.add(new MonGH("Bánh Kem Trái cây","25000","2", R.drawable.banhkemtraicay));
        arraymonGH.add(new MonGH("Bánh kem chuối","25000","2", R.drawable.banh2));
        arraymonGH.add(new MonGH("Trà sữa Trân châu","25000","2", R.drawable.ts));
    }
}
