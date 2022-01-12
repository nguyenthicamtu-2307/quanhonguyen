package com.example.foodorderapp.service;

import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.activity.ListviewPUD.Phieu;
import com.example.foodorderapp.activity.ListviewPUD.TichDiem;
import com.example.foodorderapp.model.KhachHang;
import com.example.foodorderapp.model.Loginrequired;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {
    Gson gson=new GsonBuilder().setLenient().setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();
    APIService api =new Retrofit.Builder().baseUrl("http://192.168.1.126:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService.class);
    @GET("sanpham/listar")
    Call<List<Mon>> getsanpham();
    @GET("sanpham/listts")
    Call<List<Mon>> gettrasua();
    @GET("sanpham/listcf")
    Call<List<Mon>> getcoffe();
    @GET("sanpham/listbm")
    Call<List<Mon>> getbread();
    @GET("sanpham/listbsn")
    Call<List<Mon>> getcake();
    @GET("sanpham/dexuat")
    Call<List<Mon>> dexuat();
    @GET("khachhang/listar")
    Call<List<KhachHang>> khachhang();
    @POST("khachhang/add")
    Call<KhachHang>regiter(@Body KhachHang account);

    @GET("listar")
    Call<List<Phieu>> getKhuyenmai();
    @GET("Tichdiem/listar")
    Call<List<TichDiem>> getTichDiem();
    @GET("tichdiem/getall/{username}")
    Call<TichDiem> getalll(
            @Path("username") String user
            // @Body HistoryQR Q
    );
    @GET("listar20")
    Call<List<Mon>> getMon20k();
    @GET("listar30")
    Call<List<Mon>> getMon30k();
    @GET("listar60")
    Call<List<Mon>> getMon60k();

}
