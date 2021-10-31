package com.example.foodorder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodorder.R;
import com.example.foodorder.model.use;

import java.util.List;

public class useradapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<use> mlist;

    public useradapter(Context context, int layout, List<use> mlist) {
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
        convertView=inflater.inflate(layout,null);
        use muser =mlist.get(position);
        TextView textView=convertView.findViewById(R.id.name);
        TextView textView1=convertView.findViewById(R.id.diachi);
        ImageView imageView=convertView.findViewById(R.id.img);
        textView.setText(muser.getName());
        textView1.setText(muser.getDiachi());
        imageView.setImageResource(muser.getAnh());
        return convertView;
    }
}
