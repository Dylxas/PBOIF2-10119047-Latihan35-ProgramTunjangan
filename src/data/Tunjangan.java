/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG TUNJANGAN
 */

public class Tunjangan {
    public double tunjangan;

    public double hitungTunjangan(String parStatus, int parGajipokok){
        parStatus = parStatus.toUpperCase();
            if (parStatus.equals("MENIKAH")){
            System.out.println("Gaji pokok\t: Rp. " + (double)parGajipokok);
            tunjangan = parGajipokok * 0.35;
            System.out.println("Tunjangan\t: Rp. " + tunjangan);
            System.out.println("Total Gaji\t: Rp. " + ((double)parGajipokok + tunjangan));
        }
        else{
            System.out.println("Gaji pokok\t: Rp. " + (double)parGajipokok);
            tunjangan = parGajipokok * 0;
            System.out.println("Tunjangan\t: Rp. " + tunjangan);
            System.out.println("Total Gaji\t: Rp. " + ((double)parGajipokok + tunjangan));
        }
        return(tunjangan);
    }
 }

