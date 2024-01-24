
package exercicio4;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Exercicio4 {
    public static double calcVlrImposto(double pSalarioBase)
    {
        double vlrImposto = 0;
        
        if(pSalarioBase >= 1903.99 && pSalarioBase <= 2826.65)
        {
            vlrImposto = pSalarioBase * 7.5/100;
        }
        else
            if(pSalarioBase >= 2826.66 && pSalarioBase <= 3751.05)
            {
                vlrImposto = pSalarioBase * 15/100;
            }
            else
                if(pSalarioBase >= 3751.06 && pSalarioBase <= 4664.68)
                {
                    vlrImposto = pSalarioBase * 22.5/100;
                     
                }
                else
                    if(pSalarioBase > 4664.68)
                    {
                        vlrImposto = pSalarioBase * 27/100;
                    }   
        
        
        return vlrImposto;
    }
    
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double salario = 0;
        try{            
            System.out.println("Informe o salário base");
            salario = leitura.nextDouble();
            System.out.println("O valor do imposto a pagar é " + calcVlrImposto(salario));
            
        }catch(InputMismatchException e)
        {
            System.out.println("Dígito inválido");
        }
    }
    
}
