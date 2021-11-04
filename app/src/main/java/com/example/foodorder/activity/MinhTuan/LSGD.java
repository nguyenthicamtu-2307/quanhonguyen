package com.example.foodorder.activity.MinhTuan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;

public class LSGD extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Button btn_ct1, btn_ct2, btn_ct3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lichsugd);
        ImageButton imgbt_quaylai = (ImageButton) findViewById(R.id.imgbt_qlai);
        btn_ct1= findViewById(R.id.btnchitiet1);
        btn_ct2= findViewById(R.id.btnchitiet2);
        btn_ct3 =findViewById(R.id.btnchitiet3);
        btn_ct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LSGD.this,"Bạn đổi thành công \n Trà sữa socola \n Ngày đổi: 30/04/2021", Toast.LENGTH_LONG).show();
            }
        });
        btn_ct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LSGD.this,"Bạn đổi thành công \n Trà sữa socola \n Ngày đổi: 30/04/2021", Toast.LENGTH_LONG).show();
            }
        });
        btn_ct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LSGD.this,"Bạn đổi thành công \n Trà sữa socola \n Ngày đổi: 30/04/2021", Toast.LENGTH_LONG).show();
            }
        });
    }
}