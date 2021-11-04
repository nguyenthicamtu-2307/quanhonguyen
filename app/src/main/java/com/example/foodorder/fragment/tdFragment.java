package com.example.foodorder.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.foodorder.R;
import com.example.foodorder.activity.MinhTuan.CaNhan;
import com.example.foodorder.activity.MinhTuan.LSDQ;
import com.example.foodorder.activity.MinhTuan.LSGD;
import com.example.foodorder.activity.MinhTuan.TrangChu;
import com.example.foodorder.activity.MinhTuan.hinh11Activity;
import com.example.foodorder.activity.phieuud1;
import com.example.foodorder.activity.tcactivity;


public class tdFragment extends Fragment {



    public tdFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.hinh_15, container, false);
        // Inflate the layout for this fragment

        Button butonPUD= (Button) view.findViewById(R.id.PUDhinh15);
        butonPUD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), phieuud1.class);
                startActivity(intent);
            }
        });
        Button butonDQ= (Button) view.findViewById(R.id.BtnDQ);
        butonDQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), LSDQ.class);
                startActivity(intent);
            }
        });
        Button butonlsGD= (Button) view.findViewById(R.id.btnLSGD);
        butonlsGD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), LSGD.class);
                startActivity(intent);
            }
        });
        return view;
    }
}