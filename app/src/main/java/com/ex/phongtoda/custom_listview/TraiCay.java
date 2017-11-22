package com.ex.phongtoda.custom_listview;

/**
 * Created by Phong Toda on 10/03/2017.
 */

public class TraiCay {
    private String Ten;
    private String MoTa;
    private int Hinh;

    public TraiCay(String ten, String moTa, int hinh) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

}
