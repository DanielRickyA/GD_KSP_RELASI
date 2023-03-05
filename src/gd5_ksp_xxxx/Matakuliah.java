/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class Matakuliah {
    private String namaMatkul;
    private String kodeMatkul;
    private int SKS;

    public Matakuliah(String namaMatkul, String kodeMatkul, int SKS) {
        this.namaMatkul = namaMatkul;
        this.kodeMatkul = kodeMatkul;
        this.SKS = SKS;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
    
    public void tampilMatakuliah(){
        System.out.println("Nama Matakuliah : " +getNamaMatkul());
        System.out.println("Kode Matakuliah : " +getKodeMatkul());
        System.out.println("Jumlah SKS      : " +getSKS());
    }
}
