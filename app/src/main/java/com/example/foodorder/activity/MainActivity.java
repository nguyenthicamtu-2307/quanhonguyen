package com.example.foodorder.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.foodorder.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

/*
#############################################################
#                             _ 				            #
#                          _ooOoo_				            #
#                         o8888888o				            #
#                         88" . "88				            #
#                         (| -_- |)				            #
#                         O\  =  /O				            #
#                      ____/`---'\____				        #
#                    .'  \\|     |//  `.			        #
#                   /  \\|||  :  |||//  \			        #
#                  /  _||||| -:- |||||_  \			        #
#                  |   | \\\  -  /'| |   |			        #
#                  | \_|  `\`---'//  |_/ |			        #
#                  \  .-\__ `-. -'__/-.  /			        #
#                ___`. .'  /--.--\  `. .'___			    #
#             ."" '<  `.___\_<|>_/___.' _> \"".			    #
#            | | :  `- \`. ;`. _/; .'/ /  .' ; |		    #
#            \  \ `-.   \_\_`. _.'_/_/  -' _.' /		    #
#=============`-.`___`-.__\ \___  /__.-'_.'_.-'=============#
                           `=--=-'

          _.-/`)
         // / / )
      .=// / / / )
     //`/ / / / /
    // /     ` /
   ||         /
    \\       /
     ))    .'
    //    /
         /
 */

public class MainActivity extends AppCompatActivity {
    Button btndn;
    Button btndk;
    EditText eduser, edpass;
    ImageView fb, gg;
    LoginButton bth;
    CallbackManager callbackManager;
    CheckBox remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);

        eduser = findViewById(R.id.user);
        edpass = findViewById(R.id.password);
        remember = (CheckBox) findViewById(R.id.check);
        SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
        String chek= preferences.getString("remember","");
        if(chek.equals("true")){
            Intent intent=new Intent(MainActivity.this,tcactivity.class);
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
                Intent intent = new Intent(MainActivity.this, singin.class);
                startActivity(intent);
            }
        });
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,tcactivity.class);
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
                    Toast.makeText(MainActivity.this,"Checked",Toast.LENGTH_LONG).show();
                }else if(!buttonView.isChecked()){
                    SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString("remember","false");
                    editor.apply();
                    Toast.makeText(MainActivity.this,"UnChecked",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }


}