
package com.example.foodorderapp.activity.ListviewPUD;

import com.google.gson.annotations.SerializedName;

public class Phieu {
    @SerializedName("tenkm") // trường tên KM có trong json
    private String tenkm;
    @SerializedName("chitietkm")
    private String chitietkm;
    @SerializedName("thoigianketthuc")
    private String thoigianketthuc;
    @SerializedName("giatrikm")
    private String giatrikm;


    public Phieu(String tenkm, String chitietkm, String thoigianketthuc, String giatrikm) {
        this.tenkm = tenkm;
        this.chitietkm = chitietkm;
        this.thoigianketthuc = thoigianketthuc;
        this.giatrikm = giatrikm;
    }

    public String getTenkm() {
        return tenkm;
    }

    public void setTenkm(String tenkm) {
        this.tenkm = tenkm;
    }

    public String getChitietkm() {
        return chitietkm;
    }

    public void setChitietkm(String chitietkm) {
        this.chitietkm = chitietkm;
    }

    public String getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(String thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
    }

    public String getGiatrikm() {
        return giatrikm;
    }

    public void setGiatrikm(String giatrikm) {
        this.giatrikm = giatrikm;
    }
}
