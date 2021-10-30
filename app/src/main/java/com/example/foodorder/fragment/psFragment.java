package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.history;
import com.example.foodorder.lienhe;
import com.example.foodorder.sale;
import com.example.foodorder.tcactivity;
import com.example.foodorder.ttcn;


public class psFragment extends Fragment {
    ImageView btn;
    ImageView dk,ls,lh,km;

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
        dk=view.findViewById(R.id.lienhe);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), lienhe.class);
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
        // Inflate the layout for this fragment
        return view;
    }
}