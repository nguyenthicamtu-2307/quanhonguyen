package com.example.foodorderapp.model;

public class Loginrequired {
    private String tendn;
    private  String matkhau;

    public Loginrequired(String tendn, String matkhau) {
        this.tendn = tendn;
        this.matkhau = matkhau;
    }

    public Loginrequired() {

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
