package com.example.foodorderapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.foodorderapp.Helper.ManagementCart;
import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;
import com.example.foodorderapp.model.KhachHang;

import java.text.DecimalFormat;

public class SamPham extends AppCompatActivity {
    private ImageView hinhanh;
    private TextView txtten, txtgia;
    private Button them;
    private Mon object;
    private Sanphamadapter sanphamadapter;
    private ManagementCart managementCart;
    private KhachHang khachHang;
    private int id_sp;
    private int sl = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.dongmon);
        Bundle bundleRecevie = getIntent().getExtras();
        if (bundleRecevie != null) {
            khachHang = (KhachHang) bundleRecevie.get("object_user");
            managementCart = new ManagementCart(this);
            init();
            getBundle();
        }
    }

    public static String currencyFormat(String amount) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(Double.parseDouble(amount));
    }

    private void getBundle() {
        object = (Mon) getIntent().getSerializableExtra("object");
        int drawableResourceId = this.getResources().getIdentifier(object.getHinh(), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(hinhanh);
        txtten.setText(object.getTenmon());
        txtgia.setText(currencyFormat(object.getGia()) + "VND");

        id_sp = object.getIdsp();
        sanphamadapter.setHandlerButton(new Sanphamadapter.HandlerButton() {
            @Override
            public void setOnclickEdit(int positon) {

            }

            @Override
            public void setOnclickAdd(int positon) {
                object.setSoluongdathang(sl);
                managementCart.insertFood(object);
                Intent intent = new Intent(getApplicationContext(), GioHangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object_user", khachHang);
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void setOnclickDelete(int positon) {

            }
        });
//        them.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                object.setSoluongdathang(sl);
//                managementCart.insertFood(object);
//                Intent intent=new Intent(getApplicationContext(),GioHangActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("object_user", khachHang);
//                intent.putExtras(bundle);
//                startActivity(intent);
//            }
//        });

    }

    private void init() {
        txtten = (TextView) findViewById(R.id.tenmon);
        txtgia = (TextView) findViewById(R.id.gia);

        hinhanh = (ImageView) findViewById(R.id.hinhud);
        them = (Button) findViewById(R.id.themsp);

    }
}
