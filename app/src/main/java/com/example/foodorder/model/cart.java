package com.example.foodorder.model;

public class cart {
    public int idsp;
    public String tensp;
    public long gia;
    public String hinhanh;
    public int slg;

    public cart(int idsp, String tensp, long gia, String hinhanh, int slg) {

        this.idsp = idsp;
        this.tensp = tensp;
        this.gia = gia;
        this.hinhanh = hinhanh;
        this.slg = slg;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }
}
