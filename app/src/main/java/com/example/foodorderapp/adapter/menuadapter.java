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

import com.example.foodorderapp.R;
import com.example.foodorderapp.fragment.homefragment;
import com.example.foodorderapp.model.listmenu;

import java.util.List;
public class menuadapter extends  RecyclerView.Adapter<menuadapter.menuadapterhoder> {
    private Context mcontext;
    private  List<listmenu> mlist;

    public menuadapter(Context mcontext) {
        this.mcontext = mcontext;
    }
    public void setdata(List<listmenu> list){
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
        listmenu menu=mlist.get(position);
        if(menu==null){
            return;
        }
        holder.name.setText(menu.getName());
        holder.gia.setText(menu.getMota());
        holder.imguser.setImageResource(menu.getImage());
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
}
