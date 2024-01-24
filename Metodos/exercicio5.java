
package exermetodo;
import java.util.Scanner;
import java.util.InputMismatchException;
 
public class exercicio5 {

    public static int adicionar(int n1, int n2){        
       int soma = n1 + n2; 
       return soma;
    }
    public static int subtrair(int n1, int n2){
       int subtrair = n1 - n2; 
       return subtrair;
    }
    public static int multiplicar(int n1, int n2){
       int multiplicacao = n1 * n2; 
       return multiplicacao;
    }
    public static double dividir(int n1, int n2){
       double divisao = 0;
       try{
          
           divisao = (double)n1 / (double)n2; 
       } 
       catch( ArithmeticException e)
         {
             System.out.println("Erro de divisão por zero");
         }
       return divisao;
    }    
        
    public static void main(String[] args) {
        int soma = 0,  op = 0, numero1 = 0, numero2 = 0;;
        double resultado = 0;
        Scanner teclado = new Scanner(System.in);
        
        while(op != 5)  {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtraçao");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
           try{ 
            System.out.println("Escolha uma das opções");
            op = teclado.nextInt();
            
            System.out.println("Informe um numero");
            numero1 = teclado.nextInt();
            
            System.out.println("Informe outro numero");
            numero2 = teclado.nextInt();
            
           } catch(InputMismatchException e)
             {
                System.out.println("Digite apenas números inteiros "); 
                op = 5;
             } 
                     
            switch(op){
                
                case 1 :  
                       resultado = adicionar(numero1, numero2);
                       System.out.println("O resultado da adicao é... " + resultado);
                       break;
                case 2 : 
                       resultado = subtrair(numero1, numero2);
                       System.out.println("O resultado da subtração é... " + resultado);
                       break;
                case 3 : 
                       resultado = multiplicar(numero1, numero2);
                       System.out.println("O resultado da multiplicação é... " + resultado);
                       break;
                case 4 :
                       //resultado =  dividir(numero1, numero2);
                       dividir(numero1, numero2);
                     //  System.out.println("O resultado da divisao é... " + resultado);
                       break; 
                case 5 : break;
                default:System.out.println("Dígito inválido");                
            }           
            
        }
        
    }
    
}

