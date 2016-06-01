package bangundatar;

public class SegiTiga implements BangunDatar{
    private final double Alas, Tinggi;
    
    public SegiTiga (double a, double t ){
        Alas = a;
        Tinggi = t;
    }
    public double getAlas (){
    return Alas;
}
    public double getTinggi (){
        return Tinggi;
    }

    @Override
    public double Luas() {
        return (0.5 * (Alas * Tinggi));
          }

    @Override
    public double Keliling() {
        double d;
        d = (double)Math.sqrt((Alas*Alas)+(Tinggi*Tinggi));
        return ((Alas * Alas) + (Tinggi * Tinggi) );
    }

    @Override
    public String displayInfo() {
         return ("SegiTiga" 
                + "\no Alas : " + (float) getAlas()
                + "\no Tinggi : " + (float) getTinggi()
                + "\no Luas : " + (float) Luas()
                + "\no Keliling : " + (float) Keliling ());  
    }
}