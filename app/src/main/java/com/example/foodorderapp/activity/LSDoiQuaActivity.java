package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;

import java.util.ArrayList;

public class LSDoiQuaActivity extends AppCompatActivity {
    ListView lvmonPQ,lvmonPQ1,lvmonPQ2;
    ArrayList<Mon> arraymon;
    MonAdapter monAdapter,monAdapter1,monAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phieudoiqua);
        Anhxa();
        Anhxa1();
        Anhxa2();
        monAdapter = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ.setAdapter(monAdapter);
        monAdapter1 = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ1.setAdapter(monAdapter1);
        monAdapter2 = new MonAdapter(this,R.layout.rowdoiqua,arraymon);
        lvmonPQ2.setAdapter(monAdapter2);



    }
    private void Anhxa (){
        lvmonPQ =(ListView) findViewById(R.id.LvDQ100);
        arraymon = new ArrayList<>();
        arraymon.add(new Mon("Trà sữa khoai môn","25000",R.drawable.ts1));
        arraymon.add(new Mon("Trà sữa Trân châu","25000", R.drawable.ts));

    }
    private void Anhxa1 (){
        lvmonPQ1 =(ListView) findViewById(R.id.LvDQ200);
        arraymon = new ArrayList<>();
        arraymon.add(new Mon("Trà sữa khoai môn","50000",R.drawable.ts1));
        arraymon.add(new Mon("Trà sữa Trân châu","50000", R.drawable.ts));

    }
    private void Anhxa2 (){
        lvmonPQ2 =(ListView) findViewById(R.id.LvDQ500);
        arraymon = new ArrayList<>();
        arraymon.add(new Mon("Trà sữa khoai môn","250000",R.drawable.ts1));
        arraymon.add(new Mon("Trà sữa Trân châu","250000", R.drawable.ts));

    }
}
