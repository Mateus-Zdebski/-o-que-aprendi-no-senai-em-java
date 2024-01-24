package projexer03082022;
import java.util.Scanner;

public class ProjExer03082022 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite um número");
        int x = leitura.nextInt();

        System.out.println("");
        while (n < x) {
            System.out.println(x);
            x--;
        }
    }

}
