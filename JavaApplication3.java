/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Acer
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        JavaApplication3 belajar = new JavaApplication3();
        belajar.tambah(1, 2);
        belajar.kurang(5, 4);
    }
    private void tambah(int a, int b){
        int hasil;
        hasil = a + b;
        System.out.println(hasil);
    }
    private void kurang(int a, int b){
        int hasil;
        hasil = a - b;
        System.out.println(hasil);
    
    } 
    private int funsitambah(int a, int b){
        int hasil;
        hasil = a + b;
    }
}
