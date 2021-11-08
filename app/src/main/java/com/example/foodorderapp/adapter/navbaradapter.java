package com.example.foodorderapp.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;

import com.example.foodorderapp.model.listmenu;
import com.example.foodorderapp.model.listrasua;

import java.util.ArrayList;
import java.util.List;
public class navbaradapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<listrasua> mlist;


    public navbaradapter(Context context, int layout, ArrayList<listrasua> mlist) {
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
        convertView =inflater.inflate(layout,null);
        listrasua milktea=mlist.get(position);
        TextView tenmon=convertView.findViewById(R.id.namefood);
        TextView gia=convertView.findViewById(R.id.price);
        ImageView hinhanh=convertView.findViewById(R.id.imv);

        tenmon.setText(milktea.getName());
        gia.setText(milktea.getMota());
        hinhanh.setImageResource(milktea.getImage());
        return convertView;
    }
}
