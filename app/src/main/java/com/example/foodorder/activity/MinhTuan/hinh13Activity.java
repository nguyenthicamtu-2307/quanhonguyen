package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;

public class hinh13Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_13);
        Button buton13= (Button) findViewById(R.id.but13);
        buton13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh13Activity.this,hinh14Activity.class);
                startActivity(intent);
            }
        });
        ImageButton butonBack= (ImageButton) findViewById(R.id.btnBackH13);
        butonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh13Activity.this,hinh12Activity.class);
                startActivity(intent);
            }
        });
    }
}