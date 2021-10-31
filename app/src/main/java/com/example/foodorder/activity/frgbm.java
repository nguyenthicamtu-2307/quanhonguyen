package com.example.foodorder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;

public class frgbm extends AppCompatActivity {
    Button coffe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        coffe=findViewById(R.id.back);
        coffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(frgbm.this,tcactivity.class);
                startActivity(intent);
            }
        });
    }
}
