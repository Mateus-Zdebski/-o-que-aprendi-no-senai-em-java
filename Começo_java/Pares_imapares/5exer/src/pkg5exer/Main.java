/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5exer;
import java.util.Scanner;

/**
 *
 * @author SENAI
 */
public class Main {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner teclado = new  Scanner (System.in);
     
       int fNumero1 = 0, fNumero2, resultado = 0;
        for(int x = 1;fNumero1<=10;fNumero2-- ){           
           System.out.println(x);
            System.out.println(  "Informe um numero " +"");
           fNumero1 = teclado.nextInt();
            
            System.out.println("Informe um numero ");
            fNumero2 = teclado.nextInt();
            
     
            resultado = fNumero1 + fNumero2;
            
             System.out.println("");
        
        System.out.println("resultado é: " + resultado);
        
          }
          }
    }
