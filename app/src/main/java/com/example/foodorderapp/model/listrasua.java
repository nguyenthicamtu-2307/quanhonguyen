package com.example.foodorderapp.model;

public class listrasua {
    private String name;
    private String mota;
    private int image;

    public listrasua(String name, String mota, int image) {
        this.name = name;
        this.mota = mota;
        this.image = image;
    }

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
