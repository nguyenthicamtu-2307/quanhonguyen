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
import com.example.foodorderapp.adapter.navbaradapter;
import com.example.foodorderapp.model.listrasua;

import java.util.ArrayList;
import java.util.List;

public class WishlistFragment extends Fragment {
    RecyclerView listitem;
    ArrayList<listrasua> list;
    navbaradapter adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.wishlist, container, false);
        listitem= view.findViewById(R.id.lv1);
        adapter=new navbaradapter(getActivity());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        listitem.setLayoutManager(linearLayoutManager);
        adapter.setdata(getadapter());
        listitem.setAdapter(adapter);

        return view;
    }

    private List<listrasua> getadapter() {
        list =new ArrayList<>();
        list.add(new listrasua("Trà Sữa Khoai Môn","35,000đ",R.drawable.tras));
        list.add(new listrasua("Trà Sữa Socola","30,000đ",R.drawable.ts1));
        list.add(new listrasua("Trà Sữa Matcha","20,000đ",R.drawable.ts4));


        list.add(new listrasua("Bánh Mì Bơ Tỏi","35,000đ",R.drawable.banhmibotoi));
        list.add(new listrasua("Bánh kem Pudding","55,000đ",R.drawable.banh5));
        list.add(new listrasua("Bánh Mì Thịt","15,000đ",R.drawable.banhmithit));
        return list;

    }
}
