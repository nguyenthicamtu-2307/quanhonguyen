package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.Mon;
import com.example.foodorderapp.adapter.MonAdapter;

import java.util.ArrayList;

public class BanhsinhNhatActivity extends AppCompatActivity {
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
        arraymon.add(new Mon("Bánh Kem SoCoLa","25000", R.drawable.banhkemscola));
        arraymon.add(new Mon("Bánh Kem trái Cây","25000", R.drawable.banhkemtraicay));
        arraymon.add(new Mon("Bánh Kem Panta","25000", R.drawable.banhpanta));
        arraymon.add(new Mon("Bánh Kem đặc biệt","25000", R.drawable.banh5));

    }
}
