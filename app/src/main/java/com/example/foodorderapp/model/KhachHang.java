package com.example.foodorderapp.model;

import com.google.gson.annotations.SerializedName;

public class KhachHang {
    @SerializedName("idkh")
    private String idkh;
    private String tenkh;
    private int sdt;
    private String diachi;
    private String ngaysinh;
    private String gioitinh;
    private String hinhanhkh;
    private String tendn;
    private int mk;

    public KhachHang(String idkh, String tenkh, int sdt, String diachi, String ngaysinh, String gioitinh, String hinhanhkh, String tendn, int mk) {
        this.idkh = idkh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.hinhanhkh = hinhanhkh;
        this.tendn = tendn;
        this.mk = mk;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getHinhanhkh() {
        return hinhanhkh;
    }

    public void setHinhanhkh(String hinhanhkh) {
        this.hinhanhkh = hinhanhkh;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public int getMk() {
        return mk;
    }

    public void setMk(int mk) {
        this.mk = mk;
    }
}
