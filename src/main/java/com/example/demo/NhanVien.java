package com.example.demo;

public class NhanVien {

    private int id;
    private String name;
    private String ma_nv;
    private String gioi_tinh;
    private String so_dien_thoai;
    private String ngay_sinh;

    // Constructor, getters and setters

    public NhanVien(int id, String name, String ma_nv, String gioi_tinh, String so_dien_thoai, String ngay_sinh) {
        this.id = id;
        this.name = name;
        this.ma_nv = ma_nv;
        this.gioi_tinh = gioi_tinh;
        this.so_dien_thoai = so_dien_thoai;
        this.ngay_sinh = ngay_sinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getGioi_Tinh(){
        return gioi_tinh;
    }

    public void setGioi_Tinh(){
        this.gioi_tinh = gioi_tinh;
    }

    public String getSo_dien_thoai(){
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(){
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getNgay_sinh(){
        return ngay_sinh;
    }

    public void setNgay_sinh(){
        this.ngay_sinh = ngay_sinh;
    }

// Getters and setters for remaining attributes

}
