package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.LSDoiQuaActivity;
import com.example.foodorderapp.activity.LSGDActivity;
import com.example.foodorderapp.activity.PhieuUDActvity;

public class TDfragment extends Fragment {
    Button lsdq,pud,lsudg;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tdfragment, container, false);
        Button butonDQ= (Button) view.findViewById(R.id.BtnDQ);
        butonDQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), LSDoiQuaActivity.class);
                startActivity(intent);
            }
        });

        Button phieuud=(Button)view.findViewById(R.id.PUDhinh15);
        phieuud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), PhieuUDActvity.class);
                startActivity(intent);
            }
        });
        Button GD=view.findViewById(R.id.btnLSGD);
        GD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), LSGDActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
