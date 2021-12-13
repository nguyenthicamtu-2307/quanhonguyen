package com.example.foodorderapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.fragment.homefragment;
import com.example.foodorderapp.model.listmenu;

import java.util.ArrayList;
import java.util.List;
public class menuadapter extends  RecyclerView.Adapter<menuadapter.menuadapterhoder> {
    private Context mcontext;
    private  List<Mon> mlist;

    public menuadapter(Context mcontext, List<Mon> list) {
        this.mcontext = mcontext;
        this.mlist=list;
    }
    public void setdata(List<Mon> list){
        this.mlist=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public menuadapterhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.milktea,parent,false);
        return new menuadapterhoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull menuadapterhoder holder, int position) {

        holder.name.setText(mlist.get(position).getTenmon());
        holder.gia.setText(mlist.get(position).getGia());
        Glide.with(mcontext).load(mlist.get(position).getHinh()).into(holder.imguser);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class menuadapterhoder extends RecyclerView.ViewHolder {
        TextView name, gia;
        ImageView imguser;


        public menuadapterhoder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.namefood);
            gia = itemView.findViewById(R.id.price);
            imguser = itemView.findViewById(R.id.imv);
        }
    }
    public void filterList(ArrayList<Mon> filteredList){
        mlist = filteredList;
        notifyDataSetChanged();
    }
}
