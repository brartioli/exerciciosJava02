package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio02If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite um número: ");
		x = leia.nextInt();
		
		if(x % 2 == 0 && x > 0) {
			System.out.println("O número " + x + " é par e positivo!");
		}
		else if(!(x % 2 == 0) && x < 0) {
			System.out.println("O número " + x + " é ímpar e negativo!");
		}
		else if(x % 2 == 0 && x < 0) {
			System.out.println("O número " + x + " é par e negativo!");
		}
		else {
			System.out.println("O número " + x + " é ímpar e positivo!");
		}
	
		
	leia.close();
	}

}
