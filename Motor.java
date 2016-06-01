package polimorfisme1;


public class Motor extends Kendaraan{

    @Override
    public void Berjalan() {
        System.out.println("Motor" + ' ' + super.Motor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Berbelok() {
        super.Berbelok(); //To change body of generated methods, choose Tools | Templates.
    }

}