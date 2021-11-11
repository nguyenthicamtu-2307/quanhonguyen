package com.example.foodorderapp.activity.ListviewPUD;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;

import com.example.foodorderapp.activity.ListviewMon.Mon;


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
        ImageView Imhinh=(ImageView) view.findViewById(R.id.hinh);

        // Gán Giá trị
        Phieu phieu= phieus.get(i);
        txtUudai.setText(phieu.getUudai());
        txthanSD.setText(phieu.getHanSD());

        Imhinh.setImageResource(phieu.getHinh());

        return view;
    }
}
