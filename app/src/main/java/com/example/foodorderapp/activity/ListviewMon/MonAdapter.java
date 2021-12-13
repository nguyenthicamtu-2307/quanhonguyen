package com.example.foodorderapp.activity.ListviewMon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;

import java.util.List;

public class MonAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Mon> MonList;

    public MonAdapter(Context context, int layout, List<Mon> MonList) {
        this.context = context;
        this.layout = layout;
        this.MonList = MonList;
    }

    @Override
    public int getCount() {
        return MonList.size();
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
        TextView txttenmon=(TextView) view.findViewById(R.id.tenmon);
        TextView txtgia=(TextView) view.findViewById(R.id.gia);


        // Gán Giá trị
        Mon mon= MonList.get(i);
        txttenmon.setText(mon.getTenmon());
        txtgia.setText(String.valueOf(mon.getGia()));


        return view;
    }
}
