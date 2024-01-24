
package exercicio6;
import java.util.Scanner;


public class Exercicio6 {
    public static String nomes [] = new String[5];
    
    public static void cadastrar(){
       
        Scanner leitura = new Scanner(System.in);
       // String nome = "";
        for(int x = 0; x < nomes.length; x++){
            System.out.println("Digite o " + (x+1) + " º nome");
            nomes[x] = leitura.next();
        }        
    }
    
     public static void  listar(){
        boolean naoExiste = true;
        for(String nom : nomes){
          if (nom != null){
            System.out.println(nom);
            naoExiste = false;
          }
          else
              naoExiste = true;          
        }
        if (naoExiste){
            System.out.println("Não há nomes para listar");
        }
    }
    
     public static void  procurar(){
         
        Scanner leitura2 = new Scanner(System.in); 
        String nome1 = "";
        boolean bAchou = false;
        System.out.println("Informe o nome para procurar:");
        nome1 = leitura2.next();
       
        for(String nom : nomes){
            if (nome1.equals(nom)){
                bAchou = true;
            }       
        }
        if(bAchou){
            System.out.println("Nome encontrado");
        }
        else
            System.out.println("Nome não encontrado");
             
    }
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int opcao = 0;
        while(opcao != 4){
            System.out.println(" 1 - Cadastrar");
            System.out.println(" 2 - Listar");
            System.out.println(" 3 - Procurar por nome");
            System.out.println(" 4 - Finalizar");
            System.out.println(" ");
            System.out.println("Escolher uma opçao");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:cadastrar();break;
                case 2:listar();break;
                case 3:procurar();break;
            }
            
        }      
    }
}
