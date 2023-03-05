/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class Mobil {
    private String merkMobil;
    private double hargaMobil;
    private Mesin mesin;

    public Mobil(String merkMobil, double hargaMobil, Mesin mesin) {
        this.merkMobil = merkMobil;
        this.hargaMobil = hargaMobil;
        this.mesin = mesin;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public double getHargaMobil() {
        return hargaMobil;
    }
    
    public void setHargaMobil(double hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void tampilDataMobil(){
        System.out.println("Data Mobil");
        System.out.println("Merk Mobil : " +getMerkMobil());
        System.out.println("Harga Mobil: " +getHargaMobil());
        System.out.println("-----------------");
        mesin.tampilData();
    }
}
