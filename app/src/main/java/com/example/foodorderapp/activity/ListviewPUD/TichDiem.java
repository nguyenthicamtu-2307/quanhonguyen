package com.example.foodorderapp.activity.ListviewPUD;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class TichDiem {
    private String idtd;
    @SerializedName("idkh")
    private String idkh;
    private String iddh;
    @SerializedName("sodiem")
    private int sodiem;
    private String username;
    private Date ngaytd;

    public TichDiem(String idtd, String idkh, String iddh, int sodiem, String username, Date ngaytd) {
        this.idtd = idtd;
        this.idkh = idkh;
        this.iddh = iddh;
        this.sodiem = sodiem;
        this.username = username;
        this.ngaytd = ngaytd;
    }

    public TichDiem() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdtd() {
        return idtd;
    }

    public void setIdtd(String idtd) {
        this.idtd = idtd;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getIddh() {
        return iddh;
    }

    public void setIddh(String iddh) {
        this.iddh = iddh;
    }

    public int getSodiem() {
        return sodiem;
    }

    public void setSodiem(int sodiem) {
        this.sodiem = sodiem;
    }

    public Date getNgaytd() {
        return ngaytd;
    }

    public void setNgaytd(Date ngaytd) {
        this.ngaytd = ngaytd;
    }
}
