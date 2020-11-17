/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsrpl.DesignPattern2;

/**
 *
 * @author USER
 */
public abstract class minumandingin implements Coffe {

    
    @Override
    public boolean MinumanDingin() {return true;}
      
    @Override
    public boolean MinumanPanas() {return false;}
    
    @Override
    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public abstract Integer getUkuran();
      public abstract Integer getHarga();
    
}
