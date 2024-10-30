package ExerciciosForWhileDoWhile;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int n1 = 1;
		int contPar=0, contIm=0;
		
		for(int i= 1; i<= 10 ;i++) {
			System.out.printf("Digite o " + i +"°" +"número: ");
			n1 = scanner.nextInt();
			
			if(n1 % 2 == 0) {
			contPar++;
			}else {
				contIm++;
			}
			
		}
		System.out.println("Total de números pares: " +contPar);
		System.out.println("Total de número ímpares: " +contIm);
		
		
		scanner.close();
	}

}
