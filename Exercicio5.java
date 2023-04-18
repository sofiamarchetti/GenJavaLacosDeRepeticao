package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
			
	int numero,soma=0;
	boolean resultado;
			
	Scanner leia = new Scanner(System.in);
			
	System.out.println("\nDigite um número: ");
	numero = leia.nextInt();
			
	do {		
		soma += numero;
		System.out.println("\nDigite um número: ");
		
			} while(numero != 0);
	
		System.out.println("\nA soma dos números positivos é: "+soma);
	}
	
}