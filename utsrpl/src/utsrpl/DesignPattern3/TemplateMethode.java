/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsrpl.DesignPattern3;

/**
 *
 * @author Gusti Aditya AF
 */
public abstract class TemplateMethode {
       public final void Cupcake()
 {
 Cake();
 Cream();
 Topping();
 Filling();
     System.out.println("\n");
 }

 public abstract void Cake();

 public abstract void Cream();

 public abstract void Topping();

 public abstract void Filling();

}
