
package projexer2.oop2;

/**
 *
 * @author mateus_zdebski
 */
import java.util.Scanner;
public class ProjExer2OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nome = "",clube = "",tipoNado= "";
        int idade = 0, mnada = 0, nrgols = 0 ;
        
        
        Nadador ae = new Nadador();
        Futebol ai = new Futebol();
        
        System.out.println("");
        System.out.println("Atleta");
        System.out.println("");
        
        System.out.println("Informe o nome:");
        nome = teclado.next();
        
        System.out.println("Informe a idade");
        idade = teclado.nextInt();
        
        ae.setNome(nome);
        ae.setIdade(idade);
        
        System.out.println(at.toString());

        System.out.println("");
        System.out.println("Nadador");
        System.out.println("");
        
        System.out.println("Informe metros nadadado:");
        mnada = teclado.nextInt();
        
        System.out.println("Informe tipo nadadado:");
        tipoNado = teclado.next();
        
        ae.setMnad(mnada);
        ae.setTipoNado(tipoNado);
        
        System.out.println(ae.toString());
        
        System.out.println("");
        System.out.println("Jogador de futebol");
        System.out.println("");
        
        System.out.println("Informe quantos gools foram:");
        nrgols = teclado.nextInt();
        
        System.out.println("Informe o clube:");
        clube = teclado.next();
        
        ai.setNrgols(nrgols);
        ai.setClube(clube);
        
        System.out.println(ai.toString());
    }
}
