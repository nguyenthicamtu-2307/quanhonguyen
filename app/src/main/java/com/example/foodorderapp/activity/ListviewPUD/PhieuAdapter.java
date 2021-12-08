package com.example.foodorderapp.activity.ListviewPUD;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.PhieuUDActvity;


import java.util.List;

public class PhieuAdapter extends BaseAdapter {
    private Context context;
    private int layout;

    private List<Phieu> PhieuList;

    public PhieuAdapter(Context context, int layout, List<Phieu> PhieuList) {
        this.context = context;
        this.layout = layout;
        this.PhieuList = PhieuList;
    }


    @Override
    public int getCount() {
        return PhieuList.size();

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        // ánh xạ view

        TextView txtUudai=(TextView) view.findViewById(R.id.Uudai);
        TextView txthanSD=(TextView) view.findViewById(R.id.hanSD);
        ImageView Imhinh=(ImageView) view.findViewById(R.id.hinhud);
        Button sdung=(Button) view.findViewById(R.id.button_ud4);

        // Gán Giá trị
        Phieu phieu= PhieuList.get(i);
        txtUudai.setText(phieu.getUudai());
        txthanSD.setText(phieu.getHanSD());
        Imhinh.setImageResource(phieu.getHinh());
        sdung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"ban cần chọn món trước"+ i,Toast.LENGTH_LONG ).show();
            }
        });
        return view;
    }
}
