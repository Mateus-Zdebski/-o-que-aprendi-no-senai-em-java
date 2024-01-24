/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * Calcula terreno
 */
public class exercicio1 {

    public static int calcLarguraAltura() {
        Scanner leitura = new Scanner(System.in);
        int largura = 0, altura = 0, area = 0;
        try {
            System.out.println("Informe a largura");
            largura = leitura.nextInt();

            System.out.println("Informe a altura");

            altura = leitura.nextInt();

            area = largura * altura;

        } catch (InputMismatchException e) {
            System.out.println("Informe valores numéricos ");
        }
        return area;
    }

    public static void main(String[] args) {

        int area = 0;
        area = calcLarguraAltura();
        System.out.println(" O valor da área é " + area);

    }

}
