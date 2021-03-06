package bangundatar;

public class PersegiPanjang implements BangunDatar{
private final double panjang, lebar;

public PersegiPanjang(double p, double l){
    panjang = p;
    lebar = l;  
}
public double getPanjang (){
    return panjang;
}
   public double getLebar (){
       return lebar;
   }

    @Override
    public double Luas() {
      return (panjang * lebar);
    }

    @Override
    public double Keliling() {
        return (2 * (panjang * lebar));
    }

    @Override
    public String displayInfo() {
        return ("Persegi Panjang" 
                + "\no Panjang : " + (float) getPanjang()
                + "\no Lebar : " + (float) getLebar()
                + "\no Luas : " + (float) Luas()
                + "\no Keliling : " + (float) Keliling ());
                
    }

    }
    

