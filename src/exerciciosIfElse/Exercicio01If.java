package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio01If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.printf("Digite o número A:");
		A = leia.nextInt();
		System.out.printf("Digite o número B:");
		B = leia.nextInt();
		System.out.printf("Digite o número C:");
		C = leia.nextInt();
	
		soma = A + B;
		
		if (soma > C) {
			System.out.println(A + " +" + B + " = " +soma + " > " + C);
			System.out.println("A soma de A + B é maior do que C");
		}
		else if(soma < C) {
			System.out.println(A + " + " + B + " = " + soma + " < " + C);
			System.out.println("A soma de A + B é menor do que C");
		}
		else {
			System.out.println(A + " + " + B + " = " + soma + " = " + C);
			System.out.println("A soma de A + B é igual a C");
			
		}
		leia.close();
	}

}
