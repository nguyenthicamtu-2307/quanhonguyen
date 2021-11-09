package com.example.foodorderapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.LichSuDonHang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by webmaster@dotnet.vn on 3/11/2018.
 */
public class LichSuDonHangAdapter extends ArrayAdapter<LichSuDonHang> {
    private Context context;
    private int resource;
    private List<LichSuDonHang> arrLS;

    public LichSuDonHangAdapter(Context context, int resource, ArrayList<LichSuDonHang> arrLS) {
        super(context, resource, arrLS);
        this.context = context;
        this.resource = resource;
        this.arrLS = arrLS;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_lichsudonhang, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.img);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        LichSuDonHang lichSuDonHang = arrLS.get(position);
        viewHolder.name.setText(lichSuDonHang.getName());
        viewHolder.price.setText(String.valueOf(lichSuDonHang.getPrice()));
        viewHolder.image.setImageResource(lichSuDonHang.getImage());
        return convertView;
    }

    public class ViewHolder {
        TextView name, price;
        ImageView image;

    }
}
