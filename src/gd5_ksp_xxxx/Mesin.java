/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class Mesin {
    private String namaMesin;
    private int tahunProduksi;

    public Mesin(String namaMesin, int tahunProduksi) {
        this.namaMesin = namaMesin;
        this.tahunProduksi = tahunProduksi;
    }

    public String getNamaMesin() {
        return namaMesin;
    }

    public void setNamaMesin(String namaMesin) {
        this.namaMesin = namaMesin;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public void tampilData(){
        System.out.println("Data Mesin");
        System.out.println("Nama Mesin : " +getNamaMesin());
        System.out.println("Tahun Produksi: "+getTahunProduksi());
    }
    
}
