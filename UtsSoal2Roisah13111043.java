package utssoal2roisah13111043;

import java.util.Scanner;

public class UtsSoal2Roisah13111043 {

    public static void main(String[] args) {
        int N, i, Masukan;
        int max = 1000;
        int min = 1000;
        int jumlah = 1;
        char pil;
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
        pil = inputan.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < N; i++) {
                Masukan = inputan.nextInt();
                if (Masukan <= min) {
                    if (Masukan == min) {
                        jumlah++;
                    }
                    min = Masukan;
                }
            }

        }
        if (pil == 'B') {
            for (i = 0; i < N; i++) {
                Masukan = inputan.nextInt();
                if (Masukan <= min) {
                    if (Masukan == min) {
                        jumlah++;
                    }
                    min = Masukan;
                }
            }

        }
        System.out.println("Output : " + min);
        System.out.println("Output : " + jumlah);
    }
}
