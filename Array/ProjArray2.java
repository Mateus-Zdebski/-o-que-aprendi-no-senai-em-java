
package projarray2;
import java.util.Scanner;

/**
 *
 * Objetivo: Informar 10 cidades, e apos isso mostrar a cidade dos seus sonhos.
 */
public class ProjArray2 {    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] cidades = new String[10];
        String nm_cidade = "";
        System.out.println("Informe o nome das cidades");
        System.out.println(" ");
        for(int x = 0; x < cidades.length;x++){
            System.out.println("Informe a " + (x + 1) + " º cidade ");
            nm_cidade = teclado.next();
            cidades[x] = nm_cidade;
        }
        System.out.println("=================================");
        System.out.println("Mostre a cidade dos seus sonhos");
        for(String cid : cidades){
            if(cid.equals("Joinville")){
                System.out.println(cid + " Esta é a cidade que desejo morar");
            }    
            else 
             System.out.println(cid);
           }
            
        }
    }
    

