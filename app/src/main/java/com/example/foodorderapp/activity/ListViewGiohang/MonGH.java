package com.example.foodorderapp.activity.ListViewGiohang;

public class MonGH {
    private String tenmon;
    private String gia;
    private String slg;
    private int hinh;

    public MonGH(String tenmon, String gia, String slg, int hinh) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.slg = slg;
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

    public String getSlg() {
        return slg;
    }

    public void setSlg(String slg) {
        this.slg = slg;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
