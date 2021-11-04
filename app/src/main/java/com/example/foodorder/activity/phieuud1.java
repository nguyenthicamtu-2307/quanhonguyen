package com.example.foodorder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;


public class phieuud1 extends AppCompatActivity {
    ImageButton imgbt_quaylai;
    Button button_ud1, button_ud2, button_ud3, button_ud4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phieuuudai);

        button_ud1 = (Button) findViewById(R.id.button_ud1);
        button_ud2 = (Button) findViewById(R.id.button_ud2);
        button_ud3 = (Button) findViewById(R.id.button_ud3);
        button_ud4 = (Button) findViewById(R.id.button_ud4);
        imgbt_quaylai = (ImageButton) findViewById(R.id.imgbt_qlai);

        imgbt_quaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(phieuud1.this, tcactivity.class);
                startActivity(intent);
            }
        });

        button_ud1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(phieuud1.this, "Bạn phải chọn món trước", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(phieuud1.this, dexuat.class);
                startActivity(intent);

            }
        });
        button_ud2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(phieuud1.this, "Bạn phải chọn món trước", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(phieuud1.this, dexuat.class);
                startActivity(intent);

            }
        });
        button_ud3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(phieuud1.this, "Bạn phải chọn món trước", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(phieuud1.this, dexuat.class);
                startActivity(intent);

            }
        });
        button_ud4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(phieuud1.this, "Bạn phải chọn món trước", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(phieuud1.this, dexuat.class);
                startActivity(intent);

            }
        });
        button_ud3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(phieuud1.this, "Bạn phải chọn món trước", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(phieuud1.this, dexuat.class);
                startActivity(intent);

            }
        });

    }
}