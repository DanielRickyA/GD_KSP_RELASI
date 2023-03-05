/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class Daun {
    private String tulangDaun;
    private String warnaDaun;

    public Daun(String tulangDaun, String warnaDaun) {
        this.tulangDaun = tulangDaun;
        this.warnaDaun = warnaDaun;
    }

    public String getTulangDaun() {
        return tulangDaun;
    }

    public void setTulangDaun(String tulangDaun) {
        this.tulangDaun = tulangDaun;
    }

    public String getWarnaDaun() {
        return warnaDaun;
    }

    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }
    
    public void tampilDaun(){
        System.out.println("Data Daun");
        System.out.println("-----------------");
        System.out.println("Tualng Daun : " +getTulangDaun());
        System.out.println("Warna Daun  : " +getWarnaDaun());
    }
}
