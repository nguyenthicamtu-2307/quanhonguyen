package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;
import com.example.foodorder.activity.MainActivity;

public class hinh14Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_14);
        ImageButton butonTC= (ImageButton) findViewById(R.id.btnHomeHinh14);
        butonTC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh14Activity.this, TrangChu.class);
                startActivity(intent);
            }
        });
        ImageButton butonDH= (ImageButton) findViewById(R.id.btnDHhinh14);
        butonDH.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh14Activity.this, hinh11Activity.class);
                startActivity(intent);
            }
        });

        ImageButton butonTD= (ImageButton) findViewById(R.id.btnTichDiemHinh14);

        ImageButton butonCN= (ImageButton) findViewById(R.id.BtnCanhanH14);
        butonCN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh14Activity.this, CaNhan.class);
                startActivity(intent);
            }
        });
        ImageButton butonBack= (ImageButton) findViewById(R.id.btnBackH14);
        butonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh14Activity.this,hinh13Activity.class);
                startActivity(intent);
            }
        });

    }
}