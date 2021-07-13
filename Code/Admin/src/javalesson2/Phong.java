/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson2;

/**
 *
 * @author Admin
 */
public class Phong {
    int ID;
    String tensanpham, giasanpham, hinhanhsanpham, motasanpham, IDsanpham;
    

    public Phong() {
    }

    public Phong(int ID, String tensanpham, String giasanpham, String hinhanhsanpham, String motasanpham, String IDsanpham) {
        this.tensanpham = tensanpham;
        this.giasanpham = giasanpham;
        this.hinhanhsanpham = hinhanhsanpham;
        this.motasanpham = motasanpham;
        this.IDsanpham = IDsanpham;
        this.ID = ID;
    }

    public Phong(String tensanpham, String giasanpham, String hinhanhsanpham, String motasanpham, String IDsanpham) {
        this.tensanpham = tensanpham;
        this.giasanpham = giasanpham;
        this.hinhanhsanpham = hinhanhsanpham;
        this.motasanpham = motasanpham;
        this.IDsanpham = IDsanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getGiasanpham() {
        return giasanpham;
    }

    public void setGiasanpham(String giasanpham) {
        this.giasanpham = giasanpham;
    }

    public String getHinhanhsanpham() {
        return hinhanhsanpham;
    }

    public void setHinhanhsanpham(String hinhanhsanpham) {
        this.hinhanhsanpham = hinhanhsanpham;
    }

    public String getMotasanpham() {
        return motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        this.motasanpham = motasanpham;
    }

    public String getIDsanpham() {
        return IDsanpham;
    }

    public void setIDsanpham(String IDsanpham) {
        this.IDsanpham = IDsanpham;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
