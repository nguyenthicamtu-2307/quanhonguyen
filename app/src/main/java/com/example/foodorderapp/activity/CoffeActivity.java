package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;

import java.util.ArrayList;

public class CoffeActivity extends AppCompatActivity {
    ListView lvmonts;
    ArrayList<Mon> arraymon;
    MonAdapter monAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banhmi);
        Button buton11= (Button) findViewById(R.id.btnGioHang);
        Anhxa();
        monAdapter = new MonAdapter(this,R.layout.dongmon,arraymon);
        lvmonts.setAdapter(monAdapter);



    }
    private void Anhxa (){
        lvmonts =(ListView) findViewById(R.id.LvTraSua);
        arraymon = new ArrayList<>();
        arraymon.add(new Mon("Cafe đen","25000", R.drawable.cafeden));
        arraymon.add(new Mon("Cafe Cuppucino","25000", R.drawable.cafe_cappuccino));
        arraymon.add(new Mon("Cafe sữa đá","25000", R.drawable.cafesuada));
        arraymon.add(new Mon("Cafe Latte","25000", R.drawable.latte));
        arraymon.add(new Mon("Cafe Lattemacchiato","25000", R.drawable.lattemacchiato));

    }
}
