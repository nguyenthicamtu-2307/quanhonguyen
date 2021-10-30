package com.example.foodorder;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.foodorder.R;
import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;

public class loginFragment extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg);
        btn=(Button) findViewById(R.id.next);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loginFragment.this,MainActivity.class);
                startActivity(intent);


                
            }
        });

    }


}