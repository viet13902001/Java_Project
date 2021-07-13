/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson3;

/**
 *
 * @author Admin
 */
public class Chitiethoadon {
    public int madonhang,maphong,giaphong,soluongphong;
    public String tenphong;

    public Chitiethoadon() {
    }

    public Chitiethoadon(int madonhang, int maphong, String tenphong, int giaphong, int soluongphong ) {
        this.madonhang = madonhang;
        this.maphong = maphong;
        this.giaphong = giaphong;
        this.soluongphong = soluongphong;
        this.tenphong = tenphong;
    }

    public int getMadonhang() {
        return madonhang;
    }

    public void setMadonhang(int madonhang) {
        this.madonhang = madonhang;
    }

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    public int getSoluongphong() {
        return soluongphong;
    }

    public void setSoluongphong(int soluongphong) {
        this.soluongphong = soluongphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
    
}
