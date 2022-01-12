package com.example.foodorderapp.service;

public class Client {
    //khai báo url của api
    public static final String URl_001="http://192.168.1.126:8080/";
    public static final String URL_003="http://192.168.1.126:8080/Khuyenmai/";
    public static final String URL_002="http://192.168.1.126:8080/sanpham/";
    public static APIService getApiServiceKM(){
        return GetClient.GetClient(URL_003).create(APIService.class);
    }
    public static APIService getApiServiceSP(){
        return GetClient.GetClient(URL_002).create(APIService.class);
    }
    public static APIService getAPIService(){
        return GetClient.GetClient(URl_001).create(APIService.class);


    }
}
