package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.activity.bread;
import com.example.foodorder.activity.frgcooffe;
import com.example.foodorder.activity.frgts;
import com.example.foodorder.activity.search;


public class menuFragment extends Fragment {
    private Button coffe;
    FrameLayout item1;
    ImageView ts;
    ImageView bm;
    ImageView bthc;
    EditText search;
    LinearLayout tk;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu, container, false);
        search=view.findViewById(R.id.serch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), search.class);
                startActivity(intent);
            }
        });

        bthc=view.findViewById(R.id.bsn);
        bthc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), search.class);
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