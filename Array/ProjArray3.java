
package projarray3;
import java.util.Scanner;

public class ProjArray3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] alturas = new double[10];
        String nm_atleta = "";
        double alt_atleta = 0;
        
        System.out.println("=============================");
        System.out.println("Informe os dados dos atletas");
        
        for(int x = 0; x < nomes.length;x++){
            System.out.println("Informe o " + (x +1)+ " º nome ");
            nm_atleta = teclado.next();
            
            System.out.println("Informe a altura ");
            alt_atleta = teclado.nextDouble();
            nomes[x] = nm_atleta;
            alturas[x] = alt_atleta;
            
        }
        
        System.out.println("=============================");
        System.out.println("Mostrando  os dados dos atletas");
        System.out.println(" ");
        System.out.println("NOME                ALTURA");
        for(int x = 0; x < alturas.length;x++){
            if (alturas[x] < 1.90){
                System.out.println(nomes[x] +  "      " + alturas[x] + "Dificilmente este atleta vai ser cestinha");
            }
            else
                System.out.println(nomes[x] + "       " + alturas[x]);
        }   
    }
    
}
