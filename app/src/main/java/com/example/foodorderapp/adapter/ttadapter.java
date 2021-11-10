package com.example.foodorderapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.Mon;
import com.example.foodorderapp.model.MonGH;
import com.example.foodorderapp.model.listtt;

import java.util.List;

public class ttadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<listtt> ttlist;

    public ttadapter(Context context, int layout, List<listtt> ttlist) {
        this.context = context;
        this.layout = layout;
        this.ttlist = ttlist;
    }

    @Override
    public int getCount() {
        return 0;
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
        TextView txttenmon=(TextView) convertView.findViewById(R.id.tenmon);
        TextView txtgia=(TextView) convertView.findViewById(R.id.gia);
        TextView txtslg=(TextView) convertView.findViewById(R.id.slg);
        ImageView Imhinh=(ImageView) convertView.findViewById(R.id.hinh);
        listtt mon=ttlist.get(position);
        txttenmon.setText(mon.getTenmon());
        txtgia.setText(mon.getGia());
        txtslg.setText(mon.getSlg());
        Imhinh.setImageResource(mon.getHinh());

        return convertView;
    }
}
