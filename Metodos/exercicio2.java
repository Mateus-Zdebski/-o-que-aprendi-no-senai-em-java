
package exercicio2;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * calcula media
 */
public class exercicio2 {

    public static void calcMedia()
    {
        Scanner leitura = new Scanner(System.in);
        int numero, soma = 0;
        float media = 0;
        for(int x = 1; x<=4;x++)
        {
            System.out.println("Digite o " + x + " º número ");
            numero = leitura.nextInt();
            soma = soma + numero;
        }
        media = soma/4;
        System.out.println("A média dos números informados é " + media);
        
    }
    
    public static void main(String[] args) {
        calcMedia();
    }
    
}
