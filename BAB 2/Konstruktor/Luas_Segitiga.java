/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab2.Konstruktor;

/**
 *
 * @author WINDOWS 11
 */
public class Luas_Segitiga {
    int alas, tinggi;
    double luas;
    
    //menginisialisasi nilai alas dengan constructor
    public Luas_Segitiga(){
        this.alas = 10;
    }
    //    method perhitungan
    public double Luas(){
        luas = (alas*tinggi)/2;
        return luas;
    }  
}

