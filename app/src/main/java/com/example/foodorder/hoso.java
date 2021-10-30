//package com.example.foodorder;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class hoso extends AppCompatActivity {
//    ImageView btnHistory;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hoso);
//        btnHistory =(ImageView) findViewById(R.id.btnHistory);
//        btnHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(hoso.this, history.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//}
