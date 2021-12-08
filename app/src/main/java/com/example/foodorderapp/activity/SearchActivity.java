package com.example.foodorderapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;
import com.example.foodorderapp.adapter.menuadapter;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {
    RecyclerView rec;
    APIService apiService;
    EditText txtSearch;
    Button back;
    Mon mon;
    menuadapter adapter;

    List<Mon> list=new ArrayList<Mon>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_view);
        Bundle bundleRecevie = getIntent().getExtras();
        if(bundleRecevie!=null){
            Mon mon = (Mon) bundleRecevie.get("object_user");
        }

        txtSearch = findViewById(R.id.txtSearch);
        rec=findViewById(R.id.lv_search);
        apiService= Client.getAPIService();
        listar();
        txtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());

            }
        });

    }

    private void filter(String text){
        ArrayList<Mon> filteredList = new ArrayList<>();
        for (Mon item : list){
            if(item.getTenmon().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
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
    adapter=new menuadapter( this,monan);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(adapter);
    }

    }



