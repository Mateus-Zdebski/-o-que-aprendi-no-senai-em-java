
package projexer2022030822_2;
import java.util.Scanner;


public class ProjExer2022030822_2 {
    
    public static void main(String[] args) {
        String resp = "s";
        String nome,nomeV = "";
        int idade,idadeV = 0;
        Scanner leitura = new Scanner(System.in);
        
        while(resp.equals("S") || resp.equals("s") )
        {
            
            System.out.println("Informe o nome");
            nome = leitura.nextLine();
            
            System.out.println("Informe a idade");
            idade = leitura.nextInt();
            if(idade > idadeV)
            {
                idadeV = idade;
                nomeV  = nome;
            }
            
            if(leitura.hasNextLine())
            {
                leitura.nextLine();
            }
            
           do{ 
            System.out.println("Deseja continuar (S/N)?");
            resp = leitura.nextLine();
            if(!resp.equals("S") && !resp.equals("s") && !resp.equals("n") && !resp.equals("N"))
            {
                System.out.println("Dígito inválido");
            }
            
           }while(!resp.equals("S") && !resp.equals("s") && !resp.equals("N") && !resp.equals("n")); 
            
        }
        
        System.out.println(" Nome da pessoa mais velha:" + nomeV);
        System.out.println(" Idade:" + idadeV);
        
        
    }
    
}
