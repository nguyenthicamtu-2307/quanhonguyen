package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewLSGD.LSGDAdapter;
import com.example.foodorderapp.activity.ListviewLSGD.MonLSGD;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewPUD.Phieu;
import com.example.foodorderapp.activity.ListviewPUD.PhieuAdapter;

import java.util.ArrayList;

public class PhieuUDActvity extends AppCompatActivity {
    ListView Listphieu;
    ArrayList<Phieu> phieus;
    PhieuAdapter phieuAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phieuuudai);
        Anhxa();
        phieuAdapter = new PhieuAdapter(this,R.layout.row_lsgd,phieus);
        Listphieu.setAdapter(phieuAdapter);
    }
    private void Anhxa (){
        Listphieu =(ListView) findViewById(R.id.LvPUD);
        phieus = new ArrayList<>();
        phieus.add(new Phieu("Giảm 10% cho đơn","HSD: 02/03/2021",R.drawable.ts1));
        phieus.add(new Phieu("Giảm 40% cho đơn","HSD: 02/05/2021", R.drawable.ts));
        phieus.add(new Phieu("Giảm 30% cho đơn","HSD: 02/05/2021", R.drawable.banhkemscola));
        phieus.add(new Phieu("Giảm 50% cho đơn","HSD: 02/05/2021", R.drawable.banhkemtraicay));
    }
}