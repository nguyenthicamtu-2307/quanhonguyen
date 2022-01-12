package com.example.foodorderapp.activity.ListviewMon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.foodorderapp.Helper.ManagementCart;
import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.GioHangActivity;
import com.example.foodorderapp.activity.SearchActivity;
import com.example.foodorderapp.model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class Sanphamadapter extends ArrayAdapter<Mon> {
    private Context context;
    private List<Mon> monList;
    private HandlerButton handlerButton;
    private Mon object;
    private KhachHang khachHang;
    private ManagementCart managementCart;

    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public Sanphamadapter(@NonNull Context context, int resource, @NonNull List<Mon> objects) {
        super(context, resource, objects);
        this.context = context;
        this.monList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View rowview = inflater.inflate(R.layout.dongmon, parent, false);
        TextView tensp = (TextView) rowview.findViewById(R.id.tenmon);
        TextView gia = (TextView) rowview.findViewById(R.id.gia);
        ImageView hinh = (ImageView) rowview.findViewById(R.id.hinhud);
        Button them = (Button) rowview.findViewById(R.id.themsp);
        managementCart = new ManagementCart(getContext());
        //gọi sản phẩm ở data
        tensp.setText(String.format("%s", monList.get(position).getTenmon()));
        gia.setText(String.format("%s", monList.get(position).getGia()));
        //int drawableResourceId = rowview.getContext().getResources().getIdentifier(monList.get(position).getHinh(), "drawable", rowview.getContext().getPackageName());
        Glide.with(rowview.getContext()).load(monList.get(position).getHinh()).into(hinh);
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                handlerButton.setOnclickAdd(position);
//                object.setSoluongdathang(sl);
//                managementCart.insertFood(object);
//                Intent intent=new Intent(getContext(), GioHangActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("object_user", khachHang);
//                intent.putExtras(bundle);
//                view.getContext().startActivity(intent);
                Intent intent = new Intent(view.getContext(),GioHangActivity.class);
            }
        });
        rowview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tensp.setText(String.format("%s", monList.get(position).getTenmon()));
                gia.setText(String.format("%s", monList.get(position).getGia()));

            }
        });
        return rowview;
    }

    @Override
    public int getCount() {
        return monList.size();
    }

    public void setHandlerButton(HandlerButton handlerButton) {
        this.handlerButton = handlerButton;
    }

    public interface HandlerButton {
        void setOnclickEdit(int positon);

        void setOnclickAdd(int positon);

        void setOnclickDelete(int positon);
    }


}
