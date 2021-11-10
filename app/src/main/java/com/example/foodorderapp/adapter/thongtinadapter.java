package com.example.foodorderapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.modeltt;

import java.util.List;

public class thongtinadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<modeltt> mlist;

    public thongtinadapter(Context context, int layout, List<modeltt> mlist) {
        this.context = context;
        this.layout = layout;
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        TextView txttenmon=(TextView) convertView.findViewById(R.id.name3);
        TextView txtgia=(TextView) convertView.findViewById(R.id.price3);
        ImageView Imhinh= (ImageView) convertView.findViewById(R.id.hinhanh1);
        modeltt mon=mlist.get(position);
        txttenmon.setText(mon.getTenmon());
        txtgia.setText(mon.getGia());
        Imhinh.setImageResource(mon.getHinh());

        return convertView;
    }
}
