package exerciciosCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		int num = scanner.nextInt();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		if(num <= 10) {
		System.out.println("O número " + num + " está na posição " + numeros.indexOf(num));
		}else {
			System.out.println("O número " + num + " não foiencontrado.");
		}
		
		scanner.close();
	}

}
