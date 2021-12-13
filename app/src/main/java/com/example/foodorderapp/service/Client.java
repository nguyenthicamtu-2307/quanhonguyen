package com.example.foodorderapp.service;

public class Client {
    //khai báo url của api
    public static final String URl_001="http://192.168.1.126:8080/sanpham/";
    public static APIService getAPIService(){
        return GetClient.GetClient(URl_001).create(APIService.class);

    }
}
