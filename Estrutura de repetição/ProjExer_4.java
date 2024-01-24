
package projexer03082022_4;
import java.util.Scanner;
public class ProjExer03082022_4 {

    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "", misVencedora = "";
        int nota = 0, notaMaior = 0;
        
        for(int x = 1;x<= 4;x++)
        {
        
            System.out.println("Informe o nome");
            nome = leitura.nextLine();

            System.out.println("Informe a nota");
            nota = leitura.nextInt();
                if(nota > notaMaior)
                {
                    notaMaior     = nota;
                    misVencedora  = nome;
                }
                
                 if(leitura.hasNextLine())
                 {
                    leitura.nextLine();
                 }
        }
       
        System.out.println("O nome da vencedora é " + misVencedora);
    }
    
}
