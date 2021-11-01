package com.example.foodorder.activity.MinhTuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;


public class hinh12Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_12);
        Button buton12= (Button) findViewById(R.id.but12);
        buton12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(hinh12Activity.this,hinh13Activity.class);
                startActivity(intent);
            }
        });

        Button butonclose= (Button) findViewById(R.id.close);
        butonclose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(hinh12Activity.this,Closehinh12.class);
                startActivity(intent);
            }
        });

    }
}
