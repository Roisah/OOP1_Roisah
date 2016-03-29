/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    float celcius, reamur;
        System.out.println("Masukan nilai suhu (celcius) :");
        celcius = masukan.nextFloat();
        reamur = 0.8f * celcius;
        System.out.println();
        System.out.println("Nilai suhu reamur dari inputan :");
        System.out.println(reamur);
    }
    
}
