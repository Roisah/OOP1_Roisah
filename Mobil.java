/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme1;

/**
 *
 * @author Acer
 */
public class Mobil extends Kendaraan{

    @Override
    public void Dikendarai() {
        System.out.println("Mobil" + ' ' + super.Mobil); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Mundur() {
        super.Mundur(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
