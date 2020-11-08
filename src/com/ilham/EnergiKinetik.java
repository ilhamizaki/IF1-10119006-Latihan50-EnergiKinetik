/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : program untuk menghitung energi kinetik
 */
public class EnergiKinetik {
    private double massa;
    private double kecepatan;
    private double massaGram;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getConvertKg() {
        return massaGram;
    }
    
    //mengubah gram ke kilogram
    public void setConvertKg(double massaGram) {
        this.massaGram = massaGram * 1/1000;
    }
    
    public double hitungEnergiKinetik(double massaKg, double kecepatan) {
        return (massaKg * Math.pow(kecepatan, 2) * 1/2);
    }
}
