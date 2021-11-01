package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;

public class hinh11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_11);
        Button buton11= (Button) findViewById(R.id.h11);
        buton11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh11Activity.this,hinh12Activity.class);
                startActivity(intent);
            }
        });


    }
}