/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3ºexercicio;
import java.util.Scanner;

/**
 *
 * @author SENAI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado =new  Scanner (System.in);
String nome = "", respect = "s";
float idade=0, ano = 14785, anoatual = 0;

System.out.println("Informe seu nome ");
        nome = teclado.nextLine();

        System.out.println("Informe seu ano de nascimento ");
        ano = teclado.nextFloat();
        
        System.out.println("Informe o ano atual ");
        anoatual = teclado.nextFloat();

        idade = anoatual - ano;

        System.out.println("");
        System.out.println("Exibindo os dados");
           
        System.out.println("idade é: " + idade);
               
         
      if (idade>=18){ 
           
      System.out.println("Voce já é de maior e pode fazer a carteira de motorista"+ idade);   
      } 
      
      else if (idade == 16){     
        
      System.out.println("Voce já pode votar"+idade);
     
     teclado.close();
      }
    }
    
}
