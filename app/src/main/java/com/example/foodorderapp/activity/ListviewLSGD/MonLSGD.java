package com.example.foodorderapp.activity.ListviewLSGD;

public class MonLSGD {
    private String tenmon;
    private String ngay;
    private int hinh;

    public MonLSGD(String tenmon, String ngay, int hinh) {
        this.tenmon = tenmon;
        this.ngay = ngay;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
