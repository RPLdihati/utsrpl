/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsrpl.DesignPattern3;

/**
 *
 * @author ASUS
 */
  public class ChocolateCeresCupcake extends TemplateMethode{

    @Override
    public void Cake() {
        System.out.println("@ Chocolate base Cake"); 
   }

    @Override
    public void Cream() {
       
        System.out.println("@ Cream Chocolate Frosting "); 
    }

    @Override
    public void Topping() {
      
        System.out.println("@ Topping Choco Frosting and Chocochip ");     }

    @Override
    public void Filling() {
        System.out.println("@ Filling Choco Magma");    
    }

}

