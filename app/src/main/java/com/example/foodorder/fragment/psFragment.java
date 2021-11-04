package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.activity.Dieukhoan;
import com.example.foodorder.activity.caidat;
import com.example.foodorder.activity.history;
import com.example.foodorder.activity.lienhe;
import com.example.foodorder.activity.sale;
import com.example.foodorder.activity.ttcn;


public class psFragment extends Fragment {
    ImageView btn;
    ImageView dk,ls,lh,km,caidat;

    public psFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_hoso, container, false);
        btn=view.findViewById(R.id.imageView5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ttcn.class);
                startActivity(intent);
            }
        });
        lh=view.findViewById(R.id.lienhe);
        lh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), lienhe.class);
                startActivity(intent);
            }
        });
        dk=view.findViewById(R.id.dk);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Dieukhoan.class);
                startActivity(intent);
            }
        });
        ls=view.findViewById(R.id.lsdh);
        ls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), history.class);
                startActivity(intent);
            }
        });
        km=view.findViewById(R.id.km);
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), sale.class);
                startActivity(intent);
            }
        });
        caidat =view.findViewById(R.id.imageView7);
        caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), com.example.foodorder.activity.caidat.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}