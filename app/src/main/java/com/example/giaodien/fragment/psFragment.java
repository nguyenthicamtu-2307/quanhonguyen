package com.example.giaodien.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.giaodien.R;
import com.example.giaodien.frgcooffe;
import com.example.giaodien.tcactivity;


public class psFragment extends Fragment {
ImageButton btn;


    public psFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_person, container, false);
        btn=view.findViewById(R.id.imgbt_qlai);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), tcactivity.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}