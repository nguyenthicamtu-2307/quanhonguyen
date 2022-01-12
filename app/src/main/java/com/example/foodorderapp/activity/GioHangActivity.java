package com.example.foodorderapp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.foodorderapp.Helper.ManagementCart;
import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListViewGiohang.MonGH;
import com.example.foodorderapp.activity.ListViewGiohang.MonGHAdapter;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;
import com.example.foodorderapp.model.KhachHang;

import java.util.ArrayList;

public class GioHangActivity extends AppCompatActivity {
    RecyclerView lvmonGH;
    private RecyclerView.Adapter adapter;
    private KhachHang khachhang;
    private ManagementCart managementCart;
    TextView soluong,tongtien;
    ArrayList<MonGH> arraymonGH;
    MonGHAdapter monGHAdapter;
    private int object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giohang);
        Bundle bundleRecevie = getIntent().getExtras();
        if(bundleRecevie!=null){
            khachhang = (KhachHang) bundleRecevie.get("object_user");
        }
        object = (int) getIntent().getSerializableExtra("object");
        managementCart=new ManagementCart(this);
        SharedPreferences preferences = getSharedPreferences("Diachi", MODE_PRIVATE);
        SharedPreferences preferences2 = getSharedPreferences("Pttt", MODE_PRIVATE);
        Button button11= (Button) findViewById(R.id.btnDathang_Giohang);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GioHangActivity.this,XacNhanDonHangActivity.class);
                startActivity(intent);
            }
        });

        monGHAdapter = new MonGHAdapter(this,R.layout.dongmon_giohang,arraymonGH);




    }

}
