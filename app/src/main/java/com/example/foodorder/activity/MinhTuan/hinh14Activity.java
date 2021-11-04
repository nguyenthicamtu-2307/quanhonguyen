package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;


public class hinh14Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_14);

        ImageButton butonBack= (ImageButton) findViewById(R.id.btnBackH14);
        butonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh14Activity.this,hinh13Activity.class);
                startActivity(intent);
            }
        });

    }
}