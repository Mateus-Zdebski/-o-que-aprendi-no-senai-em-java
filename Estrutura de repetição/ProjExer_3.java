
package projexer03082022_3;
import java.util.Scanner;


public class ProjExer03082022_3 {    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = -1;
        int qtPar = 0, qtImpar = 0;
        
        while(numero !=0)
        {
            System.out.println("Informe um número");
            numero = leitura.nextInt();
            if(numero != 0)
            {
                if(numero % 2 == 0)
                {
                    qtPar ++;
                }
                else
                {
                    qtImpar++;

                }
            }
                
        }
        System.out.println("Quantidade de números pares "   + qtPar);
        System.out.println("Quantidade de números ímpares " + qtImpar);
    }
    
}
