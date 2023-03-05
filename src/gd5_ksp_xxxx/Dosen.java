/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd5_ksp_xxxx;

import java.util.Vector;

/**
 *
 * @author danie
 */
public class Dosen {
    private String namaDosen;
    private String NIDN;
    private Vector<Matakuliah>daftarMatakuliah;

    public Dosen(String namaDosen, String NIDN) {
        this.namaDosen = namaDosen;
        this.NIDN = NIDN;
        this.daftarMatakuliah = new Vector<Matakuliah>();
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    
    public void tambahMatkul(Matakuliah M){
        daftarMatakuliah.addElement(M);
    }
    
    public void tampilDosen(){
        System.out.println(getNamaDosen()+ " || " +getNIDN());
        System.out.println("-----------------");
        for (int i = 0; i < daftarMatakuliah.size(); i++) {
            daftarMatakuliah.elementAt(i).tampilMatakuliah();
            System.out.println("");
        }
    }
    
}
