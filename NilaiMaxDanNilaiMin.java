6package nilaimaxdannilaimin;


import java.util.Scanner;
public class NilaiMaxDanNilaiMin {

    
    public static void main(String[] args) {
        
        int jumlah, bil, i, nilaiMin= 1000, jml = 1, nilaiMax=1;
        char pil;
        
               Scanner input = new Scanner(System.in);
               System.out.println ("Masukan jumlah =  "); jumlah = input.nextInt();
               System.out.println ("Masukan Pilihan = "); pil = input.next().charAt(0);
               
               if (pil == 'A'){
                    for (i=0; i<jumlah; i++) {
                      bil = input.nextInt();
                        if (bil <= nilaiMin) {
                            if (bil == nilaiMin){
                              jml++;
                          }
                          nilaiMin = bil;
                        }
                      }
                      System.out.println("Maka Nilai minimalnya adalah : " + nilaiMin);
                      System.out.println("Bejumlah :" + jml);
                   
               } else if (pil == 'B'){
                   for (i=0; i<jumlah; i++){
                       bil = input.nextInt();
                         if (bil >= nilaiMax){
                             if (bil == nilaiMax){
                                 jml++;
                             }
                             nilaiMax = bil;
                         }
                   }
                   System.out.println("Maka nilai maxnya adalah " + nilaiMax);
                   System.out.println("Berjumlah " + jml);
                   
                       }
               
    }
    
}
