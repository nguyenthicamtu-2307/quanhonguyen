package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.DexuatActivity;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;
import com.example.foodorderapp.adapter.navbaradapter;
import com.example.foodorderapp.model.listrasua;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WishlistFragment extends Fragment {
    ListView listitem;
    List<Mon> lvmon=new ArrayList<>();
    APIService apiService;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.wishlist, container, false);
        listitem= view.findViewById(R.id.lv1);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        TextView dx=(TextView) view.findViewById(R.id.dex);
        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), DexuatActivity.class);
                startActivity(intent);
            }
        });

        apiService= Client.getAPIService();
        listar();


        return view;
    }

    public void listar(){
        Call<List<Mon>> call=apiService.dexuat();
        call.enqueue(new Callback<List<Mon>>() {
            @Override
            public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
                if(response.isSuccessful()){
                    lvmon=response.body();
                    if(getActivity()!=null){
                        listitem.setAdapter(new Sanphamadapter(getActivity(),R.layout.bm1,lvmon));
                    }

                }
            }
            @Override
            public void onFailure(Call<List<Mon>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
}}
