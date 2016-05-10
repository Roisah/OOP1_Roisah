package tugasinheritancepewarisanikan;


public class Ikan extends Hewan {

    @Override
    public void Berenang() {
        System.out.println("Ikan" + ' ' + super.ikan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Bertelur() {
        System.out.println("Ikan" + ' ' + super.ikan1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Bernafas() {
        super.Bernafas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makan() {
        super.makan(); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
    

