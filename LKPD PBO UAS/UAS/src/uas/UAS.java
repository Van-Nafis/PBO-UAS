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
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        ArrayList<Karyawan> DataKaryawan = new ArrayList<Karyawan>();
        
        Scanner input = new Scanner(System.in);
        
        DataKaryawan dk = new DataKaryawan();
        
        while(true){
            System.out.println("1. Tambah Data");        
            System.out.println("2. Hapus Data");        
            System.out.println("3. Cari Data");        
            System.out.println("4. Lihat Data");        
            System.out.println("5. Exit");

            System.out.println("Menu Pilihan : ");
            int pilih = input.nextInt();
            
            switch (pilih){
                case 1 :
                    dk.tambah();
                    break;
                
                case 2 :
                    dk.hapus();
                    break;
                    
                case 3 :
                    dk.cari();                    
                    break;
                    
                case 4 :
                    dk.lihat();
                    break;
                    
                case (5):
                    System.out.println("Terimakasih");
                    System.exit(0);
                    
                default : 
                    System.out.println("Menu data yang anda input salah. Selahkan coba lagi");
            }          
        }



            
        
        
        
        
    }
    
}
