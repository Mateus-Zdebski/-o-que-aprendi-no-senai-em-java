/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graus.celsius;
import java.util.Scanner;

/**
 *
 * @author mateus zdebski
 * 
 */
public class GrausCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      float  c = 0, f = 0;
      Scanner teclado = new Scanner(System.in);
 
      System.out.println("informe graus celsius");
      c = teclado.nextFloat();
      
      //conversão c p f
      
     f = c*9/5 + 32;
     
     System.out.println("a temperatura e G é em F" +
      f);
      
      teclado.close();
      
    }
    
}
