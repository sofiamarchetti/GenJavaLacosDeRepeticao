package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, soma = 0, contador=0;

        do {
            System.out.println("\nDigite um número inteiro (ou 0 para encerrar): ");
            numero = leia.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        double media = (double) soma/contador;

        System.out.println("\nA soma dos múltiplos de 3 inseridos é: " +media);

        leia.close();
    }
}