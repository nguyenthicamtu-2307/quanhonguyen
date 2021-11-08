package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    private final int ID_home=1;
    private final int ID_GH=2;
    private final int ID_TD=3;
    private final int ID_PERSON=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navbar);
        TextView select_page=findViewById(R.id.selectedpage);
        MeowBottomNavigation bottomNavigation=findViewById(R.id.navbar);
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_home,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_GH,R.drawable.ic_shopping_cart));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_TD,R.drawable.ic_bank));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PERSON,R.drawable.ic_person));


        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });
        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                String name;
                switch (item.getId()){
                    case ID_home:
                        Intent intent=new Intent(MainActivity.this,homeactivity.class);
                    break;

                    case ID_GH: name="Cart";
                        break;

                    case ID_TD:name="TD";
                        break;

                    case ID_PERSON:name="Person";
                        break;
                    default:name=" ";
                }
                select_page.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            switch (item.getId()){
                                case ID_home:
                                    Intent intent=new Intent(MainActivity.this,homeactivity.class);
                                    startActivity(intent);
                                    break;

                                case ID_GH:  String avc="cá nhân fragment"; ;
                                    break;

                                case ID_TD:
                                    String view="Tích ĐIểm fragment";
                                    break;

                                case ID_PERSON:
                                    String canhan="cá nhân fragment";;
                                    break;
                                default:;
                            }
                    }
                });
            }
        });
        bottomNavigation.setCount(ID_TD,"4");
        bottomNavigation.show(ID_home,true);
    }
}