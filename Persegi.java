package bangundatar;

public class Persegi implements BangunDatar{
    private final double Sisi;
    
    public Persegi (double s){
        Sisi = s;
    }
    public double getSisi (){
    return Sisi;
    
}

    @Override
    public double Luas() {
        return (Sisi * Sisi);     
    }

    @Override
    public double Keliling() {
       return (4 * Sisi);
    }

    @Override
    public String displayInfo() {
  return ("Persegi" 
                + "\no Sisi : " + (float) getSisi()
                + "\no Luas : " + (float) Luas()
                + "\no Keliling : " + (float) Keliling ());  
    }
}
