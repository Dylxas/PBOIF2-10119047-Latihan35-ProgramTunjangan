/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan35.programtunjangan;

import data.Tunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG TUNJANGAN
 */

public class PBOIF210119047Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gajiPokok;
        String status;
        
        Scanner input = new Scanner(System.in);
        
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiPokok = input.nextInt();   
        System.out.printf("Status anda? (Menikah/Belum) : ");
        status = input.next();
        tunjangan.hitungTunjangan(status,gajiPokok);
    }
    
}
