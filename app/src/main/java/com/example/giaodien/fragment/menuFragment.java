package com.example.giaodien.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.example.giaodien.fragment.dhFragment;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.giaodien.MainActivity;
import com.example.giaodien.R;
import com.example.giaodien.frgcooffe;
import com.example.giaodien.tcactivity;


public class menuFragment extends Fragment {
private Button coffe;
FrameLayout item1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view=inflater.inflate(R.layout.fragment_menu, container, false);
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