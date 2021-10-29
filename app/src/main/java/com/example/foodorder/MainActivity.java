package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foodorder.R;
/*
#############################################################
#                             _`				            #
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);
        btndn=(Button) findViewById(R.id.button);
        btndk=(Button)findViewById(R.id.button2) ;
        btndk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,singin.class);
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
    }
}