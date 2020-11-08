/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main energi kinetik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnergiKinetik energi = new EnergiKinetik();
        
        System.out.println("=====Program Menghitung Enerti Kinetik======");
        System.out.print("Massa benda (gram) : ");
        double valueMassa = scanner.nextDouble();
        energi.setMassa(valueMassa);
        
        System.out.print("Kecepatan (m/s) : ");
        double valueKecepatan = scanner.nextDouble();
        energi.setKecepatan(valueKecepatan);
        
        energi.setConvertKg(energi.getMassa());
        
        double massaKg = energi.getConvertKg();
        
        System.out.println("\nEnergi Kinetik : " + energi.hitungEnergiKinetik(massaKg, energi.getKecepatan()) + " Joule");
        
        System.out.println("Karena energi kinetik awal adalah nol, kerja total"
                         + "yang dilakukan \nsama dengan energi kinetik akhir "
                         + "yaitu " + energi.hitungEnergiKinetik(massaKg, energi.getKecepatan()) + " Joule");
    }
    
}
