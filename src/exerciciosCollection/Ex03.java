package exerciciosCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> setNumeros = new HashSet<Integer>();
		
		for(int i = 0; i <10; i++){
		System.out.println("Digite 10 valores inteiros não repetidos: ");
		setNumeros.add(scanner.nextInt());
		}
		 Iterator<Integer> iterator = setNumeros.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
		
		
		scanner.close();
		}

	}

