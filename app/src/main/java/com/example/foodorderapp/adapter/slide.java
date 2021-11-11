package com.example.foodorderapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.foodorderapp.R;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class slide extends SliderViewAdapter<slide.Holder> {
    int[] imageview;
    public slide(int[] image){
        this.imageview=image;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.slide,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
        viewHolder.imageView.setImageResource(imageview[position]);
    }

    @Override
    public int getCount() {
        return imageview.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder{
        ImageView imageView;
        public Holder(View itemview){
            super(itemview);
            imageView=itemview.findViewById(R.id.imgview);
        }
 }

}
