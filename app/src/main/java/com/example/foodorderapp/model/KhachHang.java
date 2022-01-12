package com.example.foodorderapp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class KhachHang implements Serializable {
    @SerializedName("idkh")
    private String idkh;
    private String tenkh;
    private String sdt;
    private String diachi;
    private String ngaysinh;
    private String gioitinh;
    private String hinhanhkh;
    private String tendn;
    private String matkhau;

    public KhachHang(String idkh, String tenkh, String sdt, String diachi, String ngaysinh, String gioitinh, String hinhanhkh, String tendn, String matkhau) {
        this.idkh = idkh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.hinhanhkh = hinhanhkh;
        this.tendn = tendn;
        this.matkhau = matkhau;
    }

    public KhachHang() {

    }

    public KhachHang(String sdt, String tendn, String matkhau) {
        this.sdt = sdt;
        this.tendn = tendn;
        this.matkhau = matkhau;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
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

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}

