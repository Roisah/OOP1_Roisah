package roisah13111043hitunganminggu;

public class Roisah13111043HitunganMinggu {

    public static void main(String[] args) {
       Minggu waktu = new Minggu();
       Minggu waktu1 = new  Minggu(1, 7, 24, 60, 59);
       
        System.out.println("1 Minggu Berapa Hari ? " + waktu.convertMingguToHari(1) + " hari");
        System.out.println("1 Minggu Berapa Jam ? " + waktu.convertMingguToJam(1) + " jam");
        System.out.println("1 Minggu Berapa Menit ? " + waktu.convertMingguToMenit(1) + " menit");
        System.out.println("1 Minggu Berapa Detik ? " + waktu.convertMingguToDetik(1) + " detik");
        System.out.println("1 Hari Berapa Jam ? " + waktu.converHariToJam(1) + " jam");
        System.out.println("1 Hari Berapa Menit ? " + waktu.convertHariToMenit(1) + " menit");
    }
}
    

