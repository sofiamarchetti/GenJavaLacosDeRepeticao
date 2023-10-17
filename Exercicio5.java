package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.println("\nDigite um número (ou 0 para encerrar): ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("\nA soma dos números positivos é: " + soma);
    }
}