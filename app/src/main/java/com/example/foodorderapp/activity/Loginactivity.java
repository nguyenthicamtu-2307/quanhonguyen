package com.example.foodorderapp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


public class Loginactivity extends AppCompatActivity {
    Button btndn;
    Button btndk;
    EditText eduser, edpass;
    ImageView fb, gg;
    LoginButton bth;
    View view;
    float v=0;
    TextView u,p,forg;
    LinearLayout ln1,ln2,ln3;
    CallbackManager callbackManager;
    CheckBox remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ln1=findViewById(R.id.checkid1);
        eduser = findViewById(R.id.user);
        edpass = findViewById(R.id.password);
        u=findViewById(R.id.edituser);
        p=findViewById(R.id.editpass);
        forg=findViewById(R.id.forgot);
        ln2=findViewById(R.id.fakb);
        view=findViewById(R.id.line1);
        fb=findViewById(R.id.logo);
        remember = (CheckBox) findViewById(R.id.checkid);
        SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
        String chek= preferences.getString("remember","");
        if(chek.equals("true")){
            Intent intent=new Intent(Loginactivity.this,main.class);
            startActivity(intent);

        }else if(chek.equals("false")){
            Toast.makeText(this,"please Sing In",Toast.LENGTH_LONG).show();
        }
        bth = findViewById(R.id.fb);
        callbackManager = CallbackManager.Factory.create();
        bth.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Toast.makeText(getApplicationContext(), "đăng nhập thành công", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
            }

        });

        btndn = (Button) findViewById(R.id.button);
        btndk = (Button) findViewById(R.id.button2);
        btndk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginactivity.this,SInginActivity.class);
                startActivity(intent);
            }
        });
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginactivity.this,main.class);
                startActivity(intent);

            }
        });
        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("remember","true");
                    editor.apply();
                    Toast.makeText(Loginactivity.this,"Checked",Toast.LENGTH_LONG).show();
                }else if(!buttonView.isChecked()){
                    SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("remember","false");
                    editor.apply();
                    Toast.makeText(Loginactivity.this,"UnChecked",Toast.LENGTH_LONG).show();
                }
            }
        });
        animateView(view, 200);
        animateView(u, 400);
        animateView(eduser, 600);
        animateView(p, 800);
        animateView(edpass, 1000);
        animateView(remember, 1200);
        animateView(forg, 1400);
        animateView(btndn, 1600);
        animateView(btndk, 1800);
        animateView(ln2, 2000);
        fb.setAlpha(v);
        fb.animate().alpha(1).setDuration(800).setStartDelay(200).start();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    private void animateView (View view, int delay) {
        view.setTranslationX(200);
        view.setAlpha(v);
        view.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(delay).start();
    }
}