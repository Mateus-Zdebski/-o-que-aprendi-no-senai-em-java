
package projarray1;
import java.util.Scanner;

/**
 *
 * Objetivo: Popular o array e mostrar somente os números pares
 */
public class ProjArray1 {
    
    public static void main(String[] args){ 
        Scanner teclado = new Scanner(System.in);        
        int num = 0;
        int[] numeros = new int[5];

        for(int x = 0; x < numeros.length;x++){
            System.out.println("Informe o " + (x + 1) + "º numero");
            num = teclado.nextInt();
            numeros[x]=num;
        }
        System.out.println("=========================================");
        System.out.println("Mostrando somente os números pares");
        
        for(int n : numeros){
            if(n % 2 == 0){
                System.out.println(n);
        }        
    }
    
  }
}