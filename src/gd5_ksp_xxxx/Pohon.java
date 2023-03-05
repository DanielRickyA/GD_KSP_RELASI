/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class Pohon {
    private String namaPohon;
    private int tinggiPohon;
    private Daun daun;

    public Pohon(String namaPohon, int tinggiPohon, String tulangDaun, String warnaDaun ) {
        this.namaPohon = namaPohon;
        this.tinggiPohon = tinggiPohon;
        this.daun = new Daun(tulangDaun, warnaDaun);
    }

    public String getNamaPohon() {
        return namaPohon;
    }

    public void setNamaPohon(String namaPohon) {
        this.namaPohon = namaPohon;
    }

    public int getTinggiPohon() {
        return tinggiPohon;
    }

    public void setTinggiPohon(int tinggiPohon) {
        this.tinggiPohon = tinggiPohon;
    }

    
    
    public void tampilPohon(){
        System.out.println("Data Pohon");
        System.out.println("Nama Pohon   : " +getNamaPohon());
        System.out.println("Tinggi Pohon : " +getTinggiPohon());
        daun.tampilDaun();
    }
}
