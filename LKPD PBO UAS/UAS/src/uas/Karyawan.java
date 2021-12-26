/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.time.*;

/**
 *
 * @author Acer
 */
public class Karyawan {
    // Atribut
    String kodeKar;
    String namaKar;
    String alamatKar;
    String tanggalLahir;
    String golongan;
    int status;
    int jumlahAnak;
    
    // Costructor
    Karyawan(String id, String nama, String alamat, String tglLahir, String gol, 
            int stat, int jmlhAnak){
        kodeKar = id;
        namaKar = nama;
        alamatKar = alamat;
        tanggalLahir = tglLahir;
        golongan = gol;
        status = stat;
        jumlahAnak = jmlhAnak;
    }
    

    void print(){
        System.out.println("=====================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("---------------------");
    }
    
}
