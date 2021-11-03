package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;
import com.example.foodorder.activity.PhieuUD;

public class hinh15Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_15);
        ImageButton butonTC= (ImageButton) findViewById(R.id.btnHomeHinh15);
        butonTC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this, TrangChu.class);
                startActivity(intent);
            }
        });
        ImageButton butonDH= (ImageButton) findViewById(R.id.btnDHhinh15);
        butonDH.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this, hinh11Activity.class);
                startActivity(intent);
            }
        });

        ImageButton butonTD= (ImageButton) findViewById(R.id.btnTichDiemHinh15);
        butonTD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this, hinh15Activity.class);
                startActivity(intent);
            }
        });
        ImageButton butonCN= (ImageButton) findViewById(R.id.BtnCanhanH15);
        butonCN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this, CaNhan.class);
                startActivity(intent);
            }
        });
        Button butonPUD= (Button) findViewById(R.id.PUDhinh15);
        butonPUD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this, PhieuUD.class);
                startActivity(intent);
            }
        });
        Button butonDQ= (Button) findViewById(R.id.BtnDQ);
        butonDQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this,LSDQ.class);
                startActivity(intent);
            }
        });
        Button butonlsGD= (Button) findViewById(R.id.btnLSGD);
        butonlsGD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh15Activity.this,LSGD.class);
                startActivity(intent);
            }
        });
    }
}