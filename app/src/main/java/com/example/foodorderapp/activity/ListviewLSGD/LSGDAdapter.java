package com.example.foodorderapp.activity.ListviewLSGD;

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

public class LSGDAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonLSGD> MonList;

    public LSGDAdapter(Context context, int layout, List<MonLSGD> monList) {
        this.context = context;
        this.layout = layout;
        MonList = monList;
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
        TextView txtgia=(TextView) view.findViewById(R.id.ngay);
        ImageView Imhinh=(ImageView) view.findViewById(R.id.hinh);

        // Gán Giá trị
        MonLSGD mon= MonList.get(i);
        txttenmon.setText(mon.getTenmon());
        txtgia.setText(mon.getNgay());
        Imhinh.setImageResource(mon.getHinh());

        return view;
    }
}
