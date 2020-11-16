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
public class RedloveCupcake extends TemplateMethode{

    @Override
    public void Cake() {
        System.out.println("@ Red Velvet Cake");
    }

    @Override
    public void Cream() {
        System.out.println("@ Cream Strowberry Latte ");
    }

    @Override
    public void Topping() {
        System.out.println("@ Topping Apple Sprinkle");
    }

    @Override
    public void Filling() {
        System.out.println("@ Filling Strawberry mousse Caramel");
    }
    
}
