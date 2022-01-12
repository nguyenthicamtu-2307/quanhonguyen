package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ContactActivity;
import com.example.foodorderapp.activity.DieuKhoanActivity;
import com.example.foodorderapp.activity.LichSuDonHangActivity;
import com.example.foodorderapp.activity.PhieuUDActvity;
import com.example.foodorderapp.activity.ThongTinCaNhanActivity;

public class personfragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.personfragment, container, false);
        RelativeLayout lsdh = view.findViewById(R.id.lsdh);
        lsdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), LichSuDonHangActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout dk = view.findViewById(R.id.dk);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), DieuKhoanActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout km = view.findViewById(R.id.km);
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), PhieuUDActvity.class);
                startActivity(intent);
            }
        });

        RelativeLayout lh = view.findViewById(R.id.lh);
        lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ContactActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout ttcn = view.findViewById(R.id.ttcn);
        ttcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ThongTinCaNhanActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }


}
