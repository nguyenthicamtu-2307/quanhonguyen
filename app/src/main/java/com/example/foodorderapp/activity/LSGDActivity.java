
package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewLSGD.LSGDAdapter;
import com.example.foodorderapp.activity.ListviewLSGD.MonLSGD;

import java.util.ArrayList;

public class LSGDActivity extends AppCompatActivity {
    ListView Listmon;
    ArrayList<MonLSGD> monLSGDS;
    LSGDAdapter lsgdAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lichsu_giaodich);
        Anhxa();
        lsgdAdapter = new LSGDAdapter(this,R.layout.row_lsgd,monLSGDS);
        Listmon.setAdapter(lsgdAdapter);
    }
    private void Anhxa (){
        Listmon =(ListView) findViewById(R.id.LvLSGD);
        monLSGDS = new ArrayList<>();

        monLSGDS.add(new MonLSGD("Trà sữa Trân châu","02/05/2021", R.drawable.ts));

        monLSGDS.add(new MonLSGD("Bánh Kem Panta","02/05/2021", R.drawable.banhpanta));


    }
}

