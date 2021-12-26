/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class DataKaryawan extends Abstrack{  
    
    ArrayList<Karyawan> DataKaryawan = new ArrayList<Karyawan>();

    @Override
    public void tambah() {      
                                
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Kode Karyawan  : ");
            String id = input.nextLine();
            System.out.println("Masukan Nama Karyawan  : ");
            String nama = input.nextLine();
            System.out.println("Masukan Alamat         : ");
            String alamat = input.nextLine();
            System.out.println("Masukan Tanggal Lahir (YYYY-MM-DD) : ");
            String tgllahir = input.nextLine();
            System.out.println("Masukan Golongan (A, B, C, D)      : ");
            String gol = input.nextLine();
            System.out.println("Masukan Status Menikah (1 atau 0)  : ");
            int stat = input.nextInt();
            int jmlh = 0;
            if(stat==1){
                System.out.println("Masukan Jumlah Anak");
                int jmlhanak = input.nextInt();
                jmlh = jmlhanak;
            }    
            DataKaryawan.add(new Karyawan(id, nama, alamat, tgllahir, gol, stat,
                    jmlh));

            System.out.println("Pilih SubMenu : ");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Tambah data kembali");
            int pilih = input.nextInt();
                
            if(pilih==1){
                break;
            }
        
        
        }
    }

    @Override
    public void hapus() {
        Scanner input = new Scanner(System.in);
                
        System.out.println("Kode karyawan yang mau dihapus : ");
        String x = input.nextLine();
        
        
        
        if (DataKaryawan.indexOf(x)==-1){            
            System.out.println("Kode karyawan "+x+" tidak ada dalam data");
        }else{
            DataKaryawan.removeIf(item->item.kodeKar == x);
            System.out.println("Kode karyawan "+x+" sudah dihapus dalam data");
        }             
                    
    }      
        
    

    @Override
    public void cari() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Kode Karyawan : ");
        String kode = input.nextLine();
        
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<DataKaryawan.size(); i++){
            if(DataKaryawan.get(i).kodeKar.equals(kode)){
                index = i;
                ditemukan = true;
            }
        }
        
        if(ditemukan==true){
            DataKaryawan.get(index).print();
        } else {
            System.out.println("ID Member tidak ditemukan");
        }
    }

    @Override
    public void lihat() {
        System.out.println("=============");
        System.out.println("DATA KARYAWAN");
        System.out.println("--------------");
        System.out.format("%9s%13s%8s%10s%10s%15s%n", "Kode Kary", "Nama Kary"
                , "Gol", "Usia", "Status", "Jumlah Anak");
    }
    

    
    

}
