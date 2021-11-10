package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.model.Mon;
import com.example.foodorderapp.adapter.MonAdapter;

import java.util.ArrayList;

public class BanhMiActivity extends AppCompatActivity {
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
        arraymon.add(new Mon("Bánh Mì Thịt","25000", R.drawable.banhmithit));
        arraymon.add(new Mon("Bánh Mì Bơ Tỏi","25000", R.drawable.banhmibotoi));

    }
}
