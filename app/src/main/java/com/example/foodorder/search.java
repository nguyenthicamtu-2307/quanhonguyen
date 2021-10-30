package com.example.foodorder;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.utils.ViewSpline;

import java.util.ArrayList;

public class search extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lvContact=(ListView) findViewById(R.id.lv);
        ArrayList<use> arrayList=new ArrayList<>();
        use user1=new use ("cake","da nang",R.drawable.cake);
        use user2=new use ("cake","da nang",R.drawable.cake);
        use user3=new use ("cake","da nang",R.drawable.cake);
        use user4=new use ("cake","da nang",R.drawable.cake);
        use user5=new use ("cake","da nang",R.drawable.cake);
        use user6 =new use ("cake","da nang",R.drawable.cake);

        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);
        arrayList.add(user6);

       useradapter customAdaper = new useradapter(this,R.layout.user,arrayList);
        lvContact.setAdapter(customAdaper);
    }
}
