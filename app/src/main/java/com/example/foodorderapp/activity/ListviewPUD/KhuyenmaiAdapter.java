package com.example.foodorderapp.activity.ListviewPUD;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.foodorderapp.R;

import java.util.List;

public class KhuyenmaiAdapter extends ArrayAdapter<Phieu> {
    Context context;
    List<Phieu> phieuList;
    public KhuyenmaiAdapter(@NonNull Context context, int resource, @NonNull List<Phieu> objects) {
        super(context, resource, objects);
        this.context=context;
        this.phieuList=objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View conveView, @NonNull ViewGroup parent){
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View view=inflater.inflate(R.layout.row_phieuudai,parent,false);
        TextView txtUudai=(TextView) view.findViewById(R.id.Uudai);
        TextView txthanSD=(TextView) view.findViewById(R.id.hanSD);
        TextView giamgia= (TextView) view.findViewById(R.id.giatrikm);
        TextView chitiet= (TextView) view.findViewById(R.id.chitietkm);
        ImageView Imhinh=(ImageView) view.findViewById(R.id.hinhud);
        Button sdung=(Button) view.findViewById(R.id.button_ud4);
        //Goij sanr pham ow data
        txtUudai.setText(String.format("%s",phieuList.get(position).getTenkm()));
        chitiet.setText(String.format("%s",phieuList.get(position).getChitietkm()));
        giamgia.setText(String.format("%s",phieuList.get(position).getGiatrikm()));
        txthanSD.setText(String.format("%s",phieuList.get(position).getThoigianketthuc()));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUudai.setText(String.format("%s",phieuList.get(position).getTenkm()));
                chitiet.setText(String.format("%s",phieuList.get(position).getChitietkm()));
                giamgia.setText(String.format("%s",phieuList.get(position).getGiatrikm()));
                txthanSD.setText(String.format("%s",phieuList.get(position).getThoigianketthuc()));
            }
        });
        return view;
    }


}
