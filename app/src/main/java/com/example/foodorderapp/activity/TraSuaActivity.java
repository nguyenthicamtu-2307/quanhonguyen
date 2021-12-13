package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TraSuaActivity extends AppCompatActivity {
    ListView lvmonts;
    ArrayList<Mon> arraymon;
    List<Mon> mList=new ArrayList<Mon>();
    APIService apiService;
    MonAdapter monAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trasua);
        Button buton11= (Button) findViewById(R.id.btnGioHang);
        lvmonts=(ListView) findViewById(R.id.LvTraSua);
        apiService= Client.getAPIService();
        listar();


    }
    public void listar(){
        Call<List<Mon>> call=apiService.gettrasua();
        call.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    mList=response.body();
                    lvmonts.setAdapter(new Sanphamadapter(TraSuaActivity.this,R.layout.bm1,mList));
                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }
}
