/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttilang;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Projecttilang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //array
        String[]pelanggaran = {"Tidak Memakai Masker","Muatan Berlebih","Tidak Membawa SIM","Tidak Membawa STNK","Pengendara dibawah Umur"};
        int[] denda = {25000,50000,150000,200000,100000};
        
        System.out.println("ANDA TIDAK MEMATUHI PERATURAN LALU LINTAS!");
        System.out.println("------------------------------------------");
        System.out.println("Jenis-jenis Pelanggaran dan Jumlah Denda : ");
        
        //perulangan
         for (int i = 0; i <pelanggaran.length; i++)
            System.out.println(i+". "+pelanggaran[i]+" -> "+denda[i]);
        
        System.out.println("------------------------------------------");
        
        //scanner
        System.out.print("Masukkan Jenis Pelanggaran Anda :");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        
        String nama,ktp,alamat,telp;
        System.out.println("Pelanggaran : "+pelanggaran[pilihan]);
        
        //percabangan
        System.out.print("Silahkan masukkan uang anda :Rp.");
        int uang = input.nextInt();
        System.out.println("------------------------------------------");
        
        System.out.println("<<<<<<<<<<<<<<Surat Tilang>>>>>>>>>>>>>>>>>");
        
        if (uang > denda[pilihan]){
            System.out.print("Nama Pelanggar :");
            nama = input.next();
            
            System.out.print("Alamat Lengkap :");
            alamat = input.next();
            
            System.out.print("No. Telepon :");
            telp = input.next();
            
            System.out.println("Jenis Pelanggaran :"+pelanggaran[pilihan]);
            
            System.out.println("Jumlah Denda :"+denda[pilihan]);
            System.out.println("Uang yang dibayarkan :"+uang);
            System.out.println("Kembalian :Rp."+(uang - denda[pilihan]));
            System.out.println("Keterangan :Lunas");
    
        }else if (uang == denda[pilihan]){
            System.out.print("Nama Pelanggar :");
            nama = input.next();
            
            System.out.print("Alamat Lengkap :");
            alamat = input.next();
            
            System.out.print("No. Telepon :");
            telp = input.next();
            
            System.out.println("Jenis Pelanggaran :"+pelanggaran[pilihan]);
            
            System.out.println("Jumlah Denda :"+denda[pilihan]);
            System.out.println("Uang yang dibayarkan :"+uang);
            System.out.println("Kembalian : - ");
            System.out.println("Keterangan :Lunas");
        }else{
            System.out.print("Nama Pelanggar :");
            nama = input.next();
            
            System.out.print("Alamat Lengkap :");
            alamat = input.next();
            
            System.out.print("No. Telepon :");
            telp = input.next();
            
            System.out.println("Jenis Pelanggaran :"+pelanggaran[pilihan]);
            
            System.out.println("Jumlah Denda :"+denda[pilihan]);
            System.out.println("Uang yang dibayarkan :"+uang);
            System.out.println("Kembalian : - ");
            System.out.println("Keterangan :Uang anda kurang "+(denda[pilihan]-uang)+", Pastikan membayar dengan jumlah yang sudah ditentukan!");
              
        }            }
}

