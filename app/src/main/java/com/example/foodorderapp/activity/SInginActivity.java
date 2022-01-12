package com.example.foodorderapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.KhachHang;
import com.example.foodorderapp.service.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SInginActivity extends AppCompatActivity {
    Button btn;
    View line;
    EditText u,p,dt;
    LinearLayout ln1,ln2;
    ImageView lg;
    float v;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        innitview();

        animateView(line, 200);
        animateView(u, 400);
        animateView(p, 600);
        animateView(dt, 800);
        animateView(ln1, 1000);
        animateView(ln2, 1200);
        lg.setAlpha(v);
        lg.animate().alpha(1).setDuration(800).setStartDelay(200).start();
        btn=(Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              register();
            }
        });
    }
    private void animateView (View view, int delay) {
        view.setTranslationX(200);
        view.setAlpha(v);
        view.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(delay).start();
    }
    private  void  innitview(){
        line=findViewById(R.id.line1);
        u=findViewById(R.id.user);
        p=findViewById(R.id.password);
        dt=findViewById(R.id.dt);
        lg=findViewById(R.id.logo);
        line=findViewById(R.id.line1);
        line=findViewById(R.id.line1);
        ln1=findViewById(R.id.buton);
        ln2=findViewById(R.id.idsocal);

    }
    public void register() {
        KhachHang account = new KhachHang(dt.getText().toString(), u.getText().toString(), p.getText().toString());
        //Call<Account> call = apiService.regiter(account);
        APIService.api.regiter(account).enqueue(new Callback<KhachHang>() {
            @Override
            public void onResponse(Call<KhachHang> call, Response<KhachHang> response) {
                Toast.makeText(SInginActivity.this,"Đăng ký thành công",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(SInginActivity.this,Loginactivity.class);
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<KhachHang> call, Throwable t) {
                Toast.makeText(SInginActivity.this,"Đăng ký thành công",Toast.LENGTH_LONG).show();
            }
        });

    }}