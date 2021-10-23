package com.example.giaodien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

public class photoadaptor extends PagerAdapter {
    private Context context;

    public photoadaptor(Context context, List<photo> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    private List<photo> mlist;
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=LayoutInflater.from(container.getContext()).inflate(R.layout.item_photo,container,false);
        ImageView ingpt=view.findViewById(R.id.viewpg);
        photo pt=mlist.get(position);
        if (pt !=null){
            Glide.with(context).load(pt.getResourceid()).into(ingpt);
        }
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        if (mlist !=null){
            return mlist.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View) object);
    }
}
