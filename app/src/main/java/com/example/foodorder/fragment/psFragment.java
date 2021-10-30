package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.history;
import com.example.foodorder.myadaptor;
import com.example.foodorder.singin;
import com.example.foodorder.tcactivity;


public class psFragment extends Fragment{
    ImageButton btn;
    public psFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_hoso, container, false);
        ImageView btnHistory;
        btnHistory =(ImageView) view.findViewById(R.id.btnHistory);
        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), history.class);
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


}