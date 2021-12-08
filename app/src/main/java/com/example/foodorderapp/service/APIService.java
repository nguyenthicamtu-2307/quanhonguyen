package com.example.foodorderapp.service;

import com.example.foodorderapp.activity.ListviewMon.Mon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("listar")
    Call<List<Mon>> getsanpham();
    @GET("listts")
    Call<List<Mon>> gettrasua();
    @GET("listcf")
    Call<List<Mon>> getcoffe();
    @GET("listbm")
    Call<List<Mon>> getbread();
    @GET("listbsn")
    Call<List<Mon>> getcake();
    @GET("dexuat")
    Call<List<Mon>> dexuat();
}
