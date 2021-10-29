package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.tcactivity;


public class psFragment extends Fragment {
    ImageButton btn;


    public psFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_hoso, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}