package com.example.giaodien.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.giaodien.MainActivity;
import com.example.giaodien.R;
import com.example.giaodien.tcactivity;


public class dhFragment extends Fragment {
    private Button back;
    private View view;
    public dhFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_dh, container, false);
        back=view.findViewById(R.id.imageView17);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), tcactivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}