/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projexer1.oop;
import java.util.Scanner;

/**
 *
 * @author mateus_zdebski
 */
public class ProjExer1OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    
    pessoa p = new pessoa();
    
    String nome = "", descricao ="", embalagem ="";
    int idade = 0;
    int produtos = 0;
    
    

    
    System.out.println("Informe o nome ");
    nome = leitura.next();    
    
    System.out.println("Informe a embalagem ");
    embalagem = leitura.next();   

    System.out.println("Informe a quantidade ");
    idade = leitura.nextInt();
    
    System.out.println("Informe a descrição ");
    descricao = leitura.next();   
    
    p.setNome(nome);
    p.setEmbalagem(embalagem);
    p.setIdade(idade);
    p.setDescricao(descricao);

    System.out.println(p.toString());
    
    leitura.close();


    }
    
}
