package com.example.foodorderapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.activity.BanhMiActivity;
import com.example.foodorderapp.activity.BanhsinhNhatActivity;
import com.example.foodorderapp.activity.CoffeActivity;
import com.example.foodorderapp.activity.LichSuDonHangActivity;
import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewMon.Sanphamadapter;
import com.example.foodorderapp.activity.MainActivity;
import com.example.foodorderapp.activity.SearchActivity;

import com.example.foodorderapp.activity.TraSuaActivity;
import com.example.foodorderapp.adapter.menuadapter;
import com.example.foodorderapp.adapter.slide;
import com.example.foodorderapp.model.listmenu;
import com.example.foodorderapp.service.APIService;
import com.example.foodorderapp.service.Client;

import com.google.android.material.slider.Slider;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class homefragment extends Fragment {
    RecyclerView listvm;
    APIService apiService;
    EditText search;
  List<Mon> list=new ArrayList<Mon>();
   SliderView sliderView;
   int[] imageview={R.drawable.banh2,
           R.drawable.banhmibotoi,
           R.drawable.banhmithit,

           R.drawable.banhpanta};
    menuadapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home, container, false);
        sliderView =view.findViewById(R.id.imageSlider);
        slide slideradapter=new slide(imageview);
        sliderView.setSliderAdapter(slideradapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
        listvm=(RecyclerView) view.findViewById(R.id.rev);
        apiService= Client.getAPIService();
       listar();

        search=(EditText) view.findViewById(R.id.txtSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout cf = view.findViewById(R.id.coffee);
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CoffeActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout ts = view.findViewById(R.id.trasua);
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TraSuaActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout bm = view.findViewById(R.id.banhmi);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BanhMiActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout bsn = view.findViewById(R.id.banhsn);
        bsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BanhsinhNhatActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
public void listar(){
    Call<List<Mon>> call=apiService.getsanpham();
    call.enqueue(new Callback<List<Mon>>() {
        @Override
        public void onResponse(Call<List<Mon>> call, Response<List<Mon>> response) {
            if(response.code()!=200){
                return;
            }
            List<Mon>data= response.body();
            for (Mon mon:data){
               list.add(mon);
            }
            Putdata(data);
        }
        @Override
        public void onFailure(Call<List<Mon>> call, Throwable t) {
            Log.e("Error",t.getMessage());
        }
    });
}
private  void Putdata(List<Mon> monan){
    menuadapter menuadapter=new menuadapter(getActivity(),monan);
    listvm.setLayoutManager(new LinearLayoutManager(getActivity()));
    listvm.setAdapter(menuadapter);
}

}
