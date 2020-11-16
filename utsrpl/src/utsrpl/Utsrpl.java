/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsrpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import utsrpl.DesignPattern3.ChocolateCeresCupcake;
import utsrpl.DesignPattern3.RedloveCupcake;
import utsrpl.DesignPattern3.TemplateMethode;
import utsrpl.DesignPattern3.VanillaSweetCupcake;

/**
 *
 * @author Gusti Aditya AF
 */
public class Utsrpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int q = 0;
        
        System.out.println("TUGAS UTS RPL Design Pattern : \n        Coffee and Cupcake");
        int pilihan;
        Scanner sc = new Scanner(System.in);
        while (q!=1){
        System.out.println("Menu ");
       
        System.out.println("1. Adapter (gt aditya)");
        
        System.out.println("2. Bridge (Erika Maulidiya)");
                
        System.out.println("3. Template Method (Ryan Ramel)");
        System.out.println("0. Exit");
        System.out.println("Masukkan pilih :");
        pilihan =sc.nextInt();
       
        if(pilihan==1){
          
        }
        else if(pilihan==2){
               
           } 
     
        else if(pilihan==3){
                System.out.println("Design Pattern Template Methode - Ryan Ramel  ");
              int pilih;
              System.out.println("Pilih salah 1 jenis cupcake");
            System.out.println("1. Sweet Vanilla");
            System.out.println("2. Chocho ceres");
            System.out.println("3. Red Love");
            pilih =sc.nextInt();  
            
        switch (pilih)
        {
            case 1:
                
                   System.out.println("Vanilla Sweet Cupcake ku hai hai\n");
                   TemplateMethode vanilla = new VanillaSweetCupcake();
                   vanilla.Cupcake();
                   
                   break   ;
            case 2:
                System.out.println("Chocho Ceres Cupcake\n");
                      TemplateMethode coco = new ChocolateCeresCupcake();
                   coco.Cupcake();
                   
                   break   ;
                    
            case 3:
                   System.out.println("Red Love Cupcake \n");
                   TemplateMethode red = new RedloveCupcake();
                   red.Cupcake();
                   
                   break   ;
                  
            default:System.out.println("Pilihan tidak tersedia");
            
        }
                            }
         else if(pilihan==0){
        break;
                 }
        
        else{
            System.out.println("pilhan salah");
        }
    }
    }
    
}
