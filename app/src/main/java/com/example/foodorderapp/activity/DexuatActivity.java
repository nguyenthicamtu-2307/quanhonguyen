package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewLSGD.MonLSGD;
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

public class DexuatActivity extends AppCompatActivity {
    ListView view;
    ArrayList<Mon> dexuat;
    List<Mon> mon=new ArrayList<>();
    MonAdapter arr;
    APIService apiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(ListView) findViewById(R.id.lvdx);
        apiService= Client.getAPIService();
        listar();

    }
    public void listar(){
        Call<List<Mon>> call=apiService.dexuat();
        call.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    mon=response.body();
                    view.setAdapter(new Sanphamadapter(DexuatActivity.this,R.layout.bm1,mon));
                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }
}
