package utsoopiroisah13111043;

import java.util.Scanner;
public class UtsOOPIRoisah13111043 {
    public static double rata2;
    public static double ip;
    public static int JmlLulus = 0 ;
    public static int JmlTidakLulus = 0;
    public static int JmlData;
    double[] nilai = new double [100];

    public void HitungRata(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jumlah = input.nextDouble();
        
        double sum = 0;
        for (int i = 1; i <= jumlah; i++) {
            
            
                System.out.println("Nilai IPK " + i + ": " );
                nilai[i] = input.nextDouble();
                
                sum += nilai[i];
                
            }
        
        rata2 = sum / jumlah;
        int jumlah1 = (int) (jumlah);
        
        System.out.println("Total nilai ? " + " " + sum);
        System.out.println("IP:" + rata2);
        
        if (rata2 >= 2.75 && rata2 <= 4.00)
            System.out.println("LULUS");
        else    
            System.out.println("Data IP Tidak valid");
               
    }
    
    public void NilaiAkhir() {
        for (int i = 1; i <=rata2; i++) {
            if (rata2 >= 2.75 && rata2 <= 4.00) {
                JmlLulus = JmlLulus + 1;
                               
            } else {
                JmlTidakLulus = JmlTidakLulus + 1;
                               
            }
        }
            
        }
   public void Panggil (){
       System.out.println("Jumlah Yang Lulus : " + JmlLulus );
       System.out.println("Jumlah Yang Tidak Lulus : " + JmlTidakLulus );
   }
   
    public static void main(String[] args) {

      UtsOOPIRoisah13111043 proses = new UtsOOPIRoisah13111043();
      proses.HitungRata();
      proses.NilaiAkhir();
      proses.Panggil();
    }
    
}
        
    
    

