package exercicio3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio3 {

    public static void verIdadePeso() {
        Scanner leitura = new Scanner(System.in);
        float peso = 0;
        short idade = 0;
        try {
            System.out.println("Informe o peso ");
            peso = leitura.nextFloat();

            System.out.println("Informe a idade");
            idade = leitura.nextShort();

            if (peso >= 50 && idade >= 16 && idade <= 69) {
                System.out.println("Atende os requisitos");
            } else {
                System.out.println("Não atende os requisitos");
            }
        } catch (InputMismatchException e) {
            System.out.println("Informação inválida ");
        }

    }

    public static void main(String[] args) {
        verIdadePeso();
    }

}
