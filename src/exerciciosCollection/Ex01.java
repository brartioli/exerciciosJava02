package exerciciosCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite cinco cores:");
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		
		System.out.printf("\nListar todas as cores: " +cores);
		Collections.sort(cores);
		System.out.printf("\nOrdenar as cores: " + cores);
		
		scanner.close();
	}

}
