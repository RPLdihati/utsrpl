/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsrpl.DesignPattern3;

public class VanillaSweetCupcake extends TemplateMethode{

    @Override
    public void Cake() {
      System.out.println("@ Vanilla Cake");  
    }

    @Override
    public void Cream() {
        System.out.println("@ Cream Colourfull Vanilla ");        
    }

    @Override
    public void Topping() {
        System.out.println("@ Topping Milk Candy ");  
    }

    @Override
    public void Filling() {
      System.out.println("@ Filling Vanilla Sugar ");    }

}