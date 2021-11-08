package com.example.foodorderapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.adapter.menuadapter;
import com.example.foodorderapp.model.listmenu;

import java.util.ArrayList;
import java.util.List;

public class homefragment extends Fragment {
    RecyclerView listvm;

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
