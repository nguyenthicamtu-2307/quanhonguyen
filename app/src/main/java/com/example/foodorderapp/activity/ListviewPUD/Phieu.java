package com.example.foodorderapp.activity.ListviewPUD;

public class Phieu {
    private String uudai;
    private String hanSD;
    private int hinh;

    public Phieu(String uudai, String hanSD, int hinh) {
        this.uudai = uudai;
        this.hanSD = hanSD;
        this.hinh = hinh;
    }

    public String getUudai() {
        return uudai;
    }

    public void setUudai(String uudai) {
        this.uudai = uudai;
    }

    public String getHanSD() {
        return hanSD;
    }

    public void setHanSD(String hanSD) {
        this.hanSD = hanSD;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
