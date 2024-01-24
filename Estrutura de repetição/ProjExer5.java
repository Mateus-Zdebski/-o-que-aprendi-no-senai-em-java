
package projexer03082022_5;
import java.util.Scanner;


public class ProjExer03082022_5 {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int idade = 0, opiniao = 0;
        int qtIdadeOtimo = 0, qtIdadeBom = 0, qtIdadeRegular=0, somaIdade = 0;
        float mediaIdade = 0;
        
        for(int x=1;x<=4;x++)
        {
            System.out.println("Idade");
            idade = leitura.nextInt();
            System.out.println("Opinião sobre o filme: 1 - Regular, 2 - Bom 3 - Ótimo");
            opiniao = leitura.nextInt();
            
            if(opiniao == 1)
            {
                somaIdade = somaIdade + idade;
                qtIdadeRegular++;
            }
                        
            if(opiniao == 2)
            {
                qtIdadeBom++;
            }
            else
                if(opiniao == 3)
                {
                    qtIdadeOtimo++;
                }
        
    }
        mediaIdade = somaIdade/qtIdadeRegular;
        System.out.println("Quantidade de pessoas que responderam ótimo " + qtIdadeOtimo);
        
        System.out.println("Quantidade de pessoas que responderam bom " + qtIdadeBom);
        
        System.out.println("Média de idade de pessoas que responderam regular  " + mediaIdade);
        
    
}

}
