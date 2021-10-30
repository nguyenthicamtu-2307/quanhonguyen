package com.example.foodorder;

public class use {
    private String name,diachi;
    private int anh;

    public use(String name, String diachi, int anh) {
        this.name = name;
        this.diachi = diachi;
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
