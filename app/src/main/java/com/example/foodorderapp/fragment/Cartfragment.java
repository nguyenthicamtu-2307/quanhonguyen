package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ThongTinActivity;



import com.example.foodorderapp.adapter.navbaradapter;

import com.example.foodorderapp.model.listrasua;

import java.util.ArrayList;
import java.util.List;

public class Cartfragment extends Fragment {
   RecyclerView listitem;
    ArrayList<listrasua> list;
    navbaradapter adapter;
    Button dathang;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cartfragment, container, false);
        dathang=view.findViewById(R.id.but12);
        dathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ThongTinActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
