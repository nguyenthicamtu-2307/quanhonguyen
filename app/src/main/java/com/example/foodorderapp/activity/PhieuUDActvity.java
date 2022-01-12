package com.example.foodorderapp.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewPUD.KhuyenmaiAdapter;
import com.example.foodorderapp.activity.ListviewPUD.Phieu;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PhieuUDActvity extends AppCompatActivity {
    ListView Listphieu;
    List<Phieu> list =new ArrayList<Phieu>() ;
    KhuyenmaiAdapter khuyenmaiAdapter;
    APIService apiService;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phieuuudai);
        Listphieu =(ListView) findViewById(R.id.LvPUD);
        apiService = Client.getApiServiceKM();
        listar();

    }
    private void listar(){
        Call<List<Phieu>> call=apiService.getKhuyenmai();
        call.enqueue(new Callback<List<Phieu>>() {
            @Override
            public void onResponse(Call<List<Phieu>> call, Response<List<Phieu>> response) {
                if(response.isSuccessful()){
                    list=response.body();
                    Listphieu.setAdapter(new KhuyenmaiAdapter(PhieuUDActvity.this, R.layout.row_apikhuyemmai,list));
                }
            }

            @Override
            public void onFailure(Call<List<Phieu>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }

}