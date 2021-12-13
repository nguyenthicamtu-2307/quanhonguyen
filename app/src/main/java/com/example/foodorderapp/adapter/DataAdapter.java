package com.example.foodorderapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.CoffeActivity;
import com.example.foodorderapp.model.database;

import java.util.ArrayList;
import java.util.List;
//tạo trung gian khi đổ dữ liệu và list view
public class DataAdapter extends ArrayAdapter<database> {
    private Context context;
    private List<database> data;
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public DataAdapter(@NonNull Context context, int resource, @NonNull List<database> objects) {
        super(context, resource, objects);
        this.context=context;
        this.data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview=inflater.inflate(R.layout.dongmon,parent,false);
        TextView txtid=(TextView) rowview.findViewById(R.id.tenmon);
        TextView txtgia=(TextView) rowview.findViewById(R.id.gia);
        ImageView hinhanh=(ImageView) rowview.findViewById(R.id.hinhud);
        txtid.setText(String.format("user_id:%s",data.get(position).getName()));
        txtgia.setText(String.format("user_gia:%d",data.get(position).getGia()));
        hinhanh.setImageResource(data.get(position).getHa());
        rowview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, CoffeActivity.class);
                intent.putExtra("user_id",data.get(position).getName());
                intent.putExtra("user_name",String.valueOf(data.get(position).getGia()));
                context.startActivity(intent);
            }
        });

        return rowview;
}}
