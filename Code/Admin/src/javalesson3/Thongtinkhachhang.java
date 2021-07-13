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
public class Thongtinkhachhang {
    public String tenkhachhang,sodienthoai,email;
    public int IDkhachhang;

    public Thongtinkhachhang() {
    }

    public Thongtinkhachhang(int IDkhachhang, String tenkhachhang, String sodienthoai, String email) {
        this.tenkhachhang = tenkhachhang;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.IDkhachhang = IDkhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIDkhachhang() {
        return IDkhachhang;
    }

    public void setIDkhachhang(int IDkhachhang) {
        this.IDkhachhang = IDkhachhang;
    }

}
