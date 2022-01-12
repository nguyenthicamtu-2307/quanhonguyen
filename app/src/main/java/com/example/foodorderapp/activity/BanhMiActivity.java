package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.MonAdapter;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;

import com.example.foodorderapp.adapter.menuadapter;
import com.example.foodorderapp.model.database;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BanhMiActivity extends AppCompatActivity {
    RecyclerView lvmonts;

    Sanphamadapter monAdapter;
    Button btnadd,btngetuser;
    List<Mon> list=new ArrayList<Mon>();
    APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banhmi);
        Button buton11= (Button) findViewById(R.id.btnGioHang);
     lvmonts=(RecyclerView) findViewById(R.id.LvMi);

        apiService= Client.getAPIService();
        listar();


    }


    public void listar(){
        Call<List<Mon>> call=apiService.getsanpham();
        call.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.code()!=200){
                    return;
                }
                List<Mon>data= response.body();
                for (Mon mon:data){
                    list.add(mon);
                }
                Putdata(data);
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }
    private  void Putdata(List<Mon> monan){
        menuadapter menuadapter=new menuadapter(BanhMiActivity.this,monan);
        lvmonts.setLayoutManager(new LinearLayoutManager(BanhMiActivity.this));
        lvmonts.setAdapter(menuadapter);
    }
}
