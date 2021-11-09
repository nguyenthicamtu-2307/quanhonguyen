package com.example.foodorderapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.model.listmenu;
import com.example.foodorderapp.model.listrasua;

import java.util.List;

public class navbaradapter extends RecyclerView.Adapter<navbaradapter.navbarviewhoder> {
   private Context mcontext;
   private List<listrasua> mlists;

    public navbaradapter(Context mcontext) {
        this.mcontext = mcontext;
    }
    public void setdata(List<listrasua> list){
        this.mlists=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public navbarviewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.milktea,parent,false);
        return new navbarviewhoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull navbarviewhoder holder, int position) {
        listrasua menu=mlists.get(position);
        if(menu==null){
            return;
        }
        holder.ten.setText(menu.getName());
        holder.gia.setText(menu.getMota());
        holder.hinhanh.setImageResource(menu.getImage());
    }



    @Override
    public int getItemCount() {
        return mlists.size();
    }

    public class navbarviewhoder extends RecyclerView.ViewHolder {
        TextView ten, gia;
        ImageView hinhanh;
        public navbarviewhoder(@NonNull View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.namefood);
            gia=itemView.findViewById(R.id.price);
            hinhanh=itemView.findViewById(R.id.imv);

        }
    }


}