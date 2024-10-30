package ExerciciosForWhileDoWhile;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.printf("Digite o primeiro número do intervalo: ");
		A = sc.nextInt();
		System.out.printf("Digite o último número do intervalo: ");
		B = sc.nextInt();
		
		if(A>B) {
			System.out.println("Intervalo inválido!");
		}else
		{
			for(int i =A; i<B;i++) {
				if(i % 3 == 00 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		sc.close();
	}

}
