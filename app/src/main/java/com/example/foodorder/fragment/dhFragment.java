package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.activity.dexuat;


public class dhFragment extends Fragment {
    private Button back;
    private View view;
    TextView dx;
    public dhFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.activity_main9, container, false);
        dx=view.findViewById(R.id.dexuat);
        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), dexuat.class);
            }
        });
        return view;
    }
}