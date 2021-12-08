package com.example.foodorderapp.activity.ListviewMon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mon {
    @SerializedName("tensp")//trường tên sản phẩm có trong json

    private String tenmon;//đặt lại tên truoeng sản phẩm
    @SerializedName("giasp")

    private String gia;
    @SerializedName("hinhanh")

    private String hinh;

    public Mon(String tenmon, String gia, String hinh) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getHinh() {
        return hinh;
    }

    public String setHinh(String hinh) {
        this.hinh = hinh;
        return hinh;
    }
}
