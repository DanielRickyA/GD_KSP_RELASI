/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd5_ksp_xxxx;

/**
 *
 * @author danie
 */
public class GD5_KSP_XXXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Relasi Agregasi");
        System.out.println("=================");
        Mesin mesin = new Mesin("Piston", 2002);
        Mobil mobil = new Mobil("Avansa", 1500000, mesin);
        mobil.tampilDataMobil();
        
        System.out.println("\nRelasi Komposisi");
        System.out.println("=================");
        Pohon pohon = new Pohon("Mangga", 200, "Menyirip", "Kuning");
        pohon.tampilPohon();
        
        System.out.println("\nRelasi Asosiasi 1 Arah");
        System.out.println("=================");
        Dosen mahasiswa = new Dosen("Vincent", "200710700");
        
        Matakuliah Daspro, ISD, PBO;
        Daspro = new Matakuliah("Dasar Pemrograman", "DP", 4);
        ISD = new Matakuliah("Struktur Data", "ISD", 4);
        PBO = new Matakuliah("Pemrograman Berorientasi Objek", "PBO", 4);
        
        mahasiswa.tambahMatkul(Daspro);
        mahasiswa.tambahMatkul(ISD);
        mahasiswa.tambahMatkul(PBO);
        mahasiswa.tampilDosen();
    }
    
    
    
}
