package bangundatar;

public class TestBangunDatar {
    
    public static void main(String[] args) {
        BangunDatar a[] = new BangunDatar[3];
        
        PersegiPanjang PP = new PersegiPanjang(1, 5);
        SegiTiga SG = new SegiTiga(4 , 3);
        Persegi PS = new Persegi(2);
        
        a[0] = PP;
        a[1] = SG;
        a[2] = PS;
        
        for (BangunDatar a1 : a){
            System.out.println("\n" + a1.displayInfo());
        }
    }
}
