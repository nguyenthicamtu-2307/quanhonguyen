package com.example.foodorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorder.fragment.psFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class history extends AppCompatActivity {
    FloatingActionButton b;
    RelativeLayout historyItem1;
    RelativeLayout historyItem2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        b=(FloatingActionButton)findViewById(R.id.b);
        historyItem1 = (RelativeLayout) findViewById(R.id.historyItem1);
        historyItem2 = (RelativeLayout) findViewById(R.id.historyItem2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(history.this, tcactivity.class);
                startActivity(intent);
            }
        });
        historyItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(history.this, order.class);
                startActivity(intent);
            }
        });
        historyItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(history.this, order.class);
                startActivity(intent);
            }
        });

    }
}
