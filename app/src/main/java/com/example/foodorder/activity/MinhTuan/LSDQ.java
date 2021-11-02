package com.example.foodorder.activity.MinhTuan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;
import com.example.foodorder.activity.PhieuUD;

public class LSDQ extends AppCompatActivity {
    Button button_dq1, button_dq2, button_dq3;
    Context context;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsdq);
        ImageButton imgbt_quaylai = (ImageButton) findViewById(R.id.imgbt_qlai);

        imgbt_quaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LSDQ.this, hinh15Activity.class);
                startActivity(intent);
            }
        });
        button_dq1 = (Button) findViewById(R.id.button_ud1);
        button_dq2 = (Button) findViewById(R.id.button_ud2);
        button_dq3 = (Button) findViewById(R.id.button_ud3);
        button_dq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LSDQ.this, hinh12Activity.class);
            }
        });
    }

}
