package com.example.foodorderapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.foodorderapp.R;
import com.example.foodorderapp.fragment.Cartfragment;
import com.example.foodorderapp.fragment.TDfragment;
import com.example.foodorderapp.fragment.homefragment;
import com.example.foodorderapp.fragment.personfragment;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navbar);

        MeowBottomNavigation bottomNavigation=findViewById(R.id.navbar);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_shopping_cart));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_bank));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_person));

       bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
           @Override
           public void onShowItem(MeowBottomNavigation.Model item) {
               Fragment fragment=null;
               switch (item.getId()){
                   case 1:
                       fragment= new homefragment();
                       break;
                   case 2:
                       fragment= new Cartfragment();
                       break;
                   case 3:
                       fragment= new TDfragment();
                       break;
                   case 4:
                       fragment= new personfragment();
                       break;
               }
               loadFragment(fragment);
           }
       });

        bottomNavigation.setCount(2,"10");
        bottomNavigation.show(2,true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"youclick"+ item.getId(),Toast.LENGTH_LONG).show();
            }
        });

    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.layout1,fragment).commit();
    }
}