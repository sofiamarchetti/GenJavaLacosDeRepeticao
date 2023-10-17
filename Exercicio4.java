package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int backendDevelopers = 0,femaleFrontendDevelopers = 0,maleMobileDevelopersOver40 = 0, femaleFullStackDevelopersUnder30 = 0;
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.println("Digite a idade da pessoa colaboradora: ");
            int idade = scanner.nextInt();

            System.out.println("Digite o sexo da pessoa colaboradora (1-Masculino, 2-Feminino, 3-Outros): ");
            int sexo = scanner.nextInt();

            System.out.println("Digite a categoria da pessoa colaboradora (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            int categoria = scanner.nextInt();

            if (categoria == 1) {
                backendDevelopers++;
            } else if (categoria == 2 && sexo == 2) {
                femaleFrontendDevelopers++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                maleMobileDevelopersOver40++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                femaleFullStackDevelopersUnder30++;
            }

            System.out.println("Deseja continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("O número de pessoas desenvolvedoras Backend: " + backendDevelopers);
        System.out.println("O número de mulheres desenvolvedoras Frontend: " + femaleFrontendDevelopers);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + maleMobileDevelopersOver40);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + femaleFullStackDevelopersUnder30);

        scanner.close();
    }
}