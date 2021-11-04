package com.example.foodorder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.R;

public class caidat extends AppCompatActivity {
    Switch swtSwitch1,swtSwitch2, swtSwitch3 ;
    Button btntt,btncn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caidat);
        swtSwitch1= findViewById(R.id.switch1);
        swtSwitch2 =findViewById(R.id.switch2);
        swtSwitch3 = findViewById(R.id.switch3);
        swtSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(caidat.this, "Bạn đã bật thông báo ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(caidat.this, "Bạn đã tắt thông báo ", Toast.LENGTH_SHORT).show();
            }
        });
        swtSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(caidat.this, "Bạn đã hiển thị thông tin cá nhân ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(caidat.this, "Bạn đã ẩn thông tin cá nhân", Toast.LENGTH_SHORT).show();
            }
        });
        swtSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    Toast.makeText(caidat.this, "Bạn đã hiển thị món ăn yêu thích", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(caidat.this, "Bạn đã ẩn món ăn yêu thích", Toast.LENGTH_SHORT).show();

            }
        });
        btntt= (Button) findViewById(R.id.btn_tt);
        btntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(caidat.this,ttcn.class);
                startActivity(intent);
            }
        });
        btncn=(Button) findViewById(R.id.btn_cn);
        btncn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(caidat.this,"Chưa có phiên bản cập nhật", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
