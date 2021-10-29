package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.foodorder.MainActivity;
import com.example.foodorder.R;
import com.example.foodorder.bread;
import com.example.foodorder.bsn;
import com.example.foodorder.frgcooffe;
import com.example.foodorder.frgts;
import com.example.foodorder.tcactivity;


public class menuFragment extends Fragment {
    private Button coffe;
    FrameLayout item1;
    ImageView ts;
    ImageView bm;
    ImageView bthc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu, container, false);


        bthc=view.findViewById(R.id.bsn);
        bthc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), bsn.class);
                startActivity(intent);
            }
        });
        bm=view.findViewById(R.id.banhmi);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent=new Intent(getActivity(), bread.class);
                startActivity(intent);
            }
        });
        ts=view.findViewById(R.id.ts);
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), frgts.class);
                startActivity(intent);
            }
        });
        coffe= view.findViewById(R.id.imageView16);
        coffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), frgcooffe.class);
                startActivity(intent);
            }
        });


        // Inflate the layout for this fragment
        return view;

    }


}