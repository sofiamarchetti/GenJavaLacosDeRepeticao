package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
    }
}