package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.BanhMiActivity;
import com.example.foodorderapp.activity.BanhsinhNhatActivity;
import com.example.foodorderapp.activity.CoffeActivity;
import com.example.foodorderapp.activity.TraSuaActivity;
import com.example.foodorderapp.adapter.menuadapter;
import com.example.foodorderapp.model.listmenu;

import java.util.ArrayList;
import java.util.List;

public class homefragment extends Fragment {
    RecyclerView listvm;
    ImageView ts,bm,bsn;
    Button cf;
    menuadapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home, container, false);
        listvm=view.findViewById(R.id.rev);
        adapter=new menuadapter(getActivity());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        listvm.setLayoutManager(linearLayoutManager);
        adapter.setdata(getlist());
        listvm.setAdapter(adapter);
        cf=view.findViewById(R.id.cafe);
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CoffeActivity.class);
                startActivity(intent);
            }
        });
        ts=view.findViewById(R.id.ts);
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TraSuaActivity.class);
                startActivity(intent);
            }
        });
        bm=view.findViewById(R.id.banhmi);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BanhMiActivity.class);
                startActivity(intent);
            }
        });
        bsn=view.findViewById(R.id.bsn);
        bsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BanhsinhNhatActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

    private List<listmenu> getlist() {
      List<listmenu> listmenus =new ArrayList<>();
        listmenus.add(new listmenu("Trà Sữa Khoai Môn","35,000đ",R.drawable.tras));
        listmenus.add(new listmenu("Trà Sữa Socola","30,000đ",R.drawable.ts1));
        listmenus.add(new listmenu("Trà Sữa Matcha","20,000đ",R.drawable.ts4));


        listmenus.add(new listmenu("Bánh Mì Bơ Tỏi","35,000đ",R.drawable.banhmibotoi));
        listmenus.add(new listmenu("Bánh kem Pudding","55,000đ",R.drawable.banh5));
        listmenus.add(new listmenu("Bánh Mì Thịt","15,000đ",R.drawable.banhmithit));
        return listmenus;
    }

}
