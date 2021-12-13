package com.example.foodorderapp.activity.ListViewGiohang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;

import java.util.List;

public class MonGHAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonGH> MonList;

    public MonGHAdapter(Context context, int layout, List<MonGH> MonList) {
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
        TextView txtslg=(TextView) view.findViewById(R.id.slg);
        ImageView Imhinh=(ImageView) view.findViewById(R.id.hinhud);

        // Gán Giá trị
        MonGH mon= MonList.get(i);
        txttenmon.setText(mon.getTenmon());
        txtgia.setText(mon.getGia());
        txtslg.setText(mon.getSlg());
        Imhinh.setImageResource(mon.getHinh());

        return view;
    }
}
