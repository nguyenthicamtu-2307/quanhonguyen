package com.example.foodorderapp.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.model.KhachHang;
import com.example.foodorderapp.model.Loginrequired;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Loginactivity extends AppCompatActivity {
    Button btndn;
    Button btndk;
    EditText eduser, edpass;
    ImageView fb, gg;
    LoginButton bth;
    View view;
    private List<KhachHang> khachHangs;
    float v=0;
    KhachHang kh;
    TextView u,p,forg;
    LinearLayout ln1,ln2,ln3;
    CallbackManager callbackManager;
    CheckBox remember;
    APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        apiService=Client.getAPIService();
        login();
        ln1=findViewById(R.id.checkid1);
        eduser = findViewById(R.id.user);
        edpass = findViewById(R.id.password);
        String tendn= eduser.getText().toString();
        String matkhau=edpass.getText().toString();
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

                //check tt dang nhap
                if(TextUtils.isEmpty(eduser.getText().toString())||
                        TextUtils.isEmpty(edpass.getText().toString())){
                    Toast.makeText(Loginactivity.this,
                            "Username/password in required",Toast.LENGTH_LONG).show();
                }else {
                    checklogin();
                }

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
    public void login() {


        Call<List<KhachHang>> call = apiService.khachhang();
        call.enqueue(new Callback<List<KhachHang>>() {
            @Override
            public void onResponse(Call<List<KhachHang>> call, Response<List<KhachHang>> response) {
                khachHangs=response.body();
            }

            @Override
            public void onFailure(Call<List<KhachHang>> call, Throwable t) {

            }
        });
    }
    public void checklogin(){
        String strUsername=eduser.getText().toString().trim();
        String strPassword=edpass.getText().toString().trim();
        AlertDialog.Builder alert = new AlertDialog.Builder(Loginactivity.this);
        alert.setTitle("Nhập Thiếu Thông Tin");
        alert.setMessage("Bạn nhập thiếu thông tin. Vui lòng nhập lại");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alert.setCancelable(true);
            }
        });
        if(strUsername.isEmpty()||strPassword.isEmpty()){
            alert.show();
        }
        else {
            if(khachHangs == null || khachHangs.isEmpty()){
                return;
            }
            boolean isHasUser = false;
            for(KhachHang khachHang: khachHangs){
                if(strUsername.equals(khachHang.getTendn()) && strPassword.equals(khachHang.getMatkhau())){
                    isHasUser = true;
                    kh = khachHang;
                    break;
                }
            }
            if (isHasUser){
                Intent intent = new Intent(getApplicationContext(), main.class);
                startActivity(intent);
                finish();
            }else {
                alert.setTitle("Đăng nhập thất bại");
                alert.setMessage("Bạn nhập sai tên đăng nhập hoặc mật khẩu! Vui lòng kiểm tra lại!");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert.setCancelable(true);
                    }
                });
                alert.show();
            }
        }
    }
    }
