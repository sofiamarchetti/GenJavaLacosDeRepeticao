package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1,num2=0,x=0;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num1 = leia.nextInt();
		
		if (num1>num2) {
			System.out.println("Intervalo inválido!");	
		}
		
		for (x=num1;x<=num2;x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(x+" é múltiplo de 3 e 5.");
			}			
		}
	}
}
