package com.example.foodorderapp.service;

import com.example.foodorderapp.activity.ListviewMon.Mon;
import com.example.foodorderapp.model.KhachHang;
import com.example.foodorderapp.model.Loginrequired;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {
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


}
