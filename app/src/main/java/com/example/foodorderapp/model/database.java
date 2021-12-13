package com.example.foodorderapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class database {
private List<database> data;
@SerializedName("name")
    @Expose private String name;
@SerializedName("gia")
    @Expose private int gia;
    @SerializedName("hinhanh")
    @Expose private int ha;

    public database(List<database> data, String name, int gia, int ha) {
        this.data = data;
        this.name = name;
        this.gia = gia;
        this.ha = ha;
    }

    public List<database> getData() {
        return data;
    }

    public void setData(List<database> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getHa() {
        return ha;
    }

    public void setHa(int ha) {
        this.ha = ha;
    }
}
