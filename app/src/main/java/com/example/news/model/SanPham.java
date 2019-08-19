package com.example.news.model;

public class SanPham {
    private int id;
    private String tensp;
    private byte[] hinhanh;
    private int loai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public byte[] getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(byte[] hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public SanPham(int id, String tensp, byte[] hinhanh, int loai) {
        this.id = id;
        this.tensp = tensp;
        this.hinhanh = hinhanh;
        this.loai = loai;
    }

    public SanPham() {
    }
}
