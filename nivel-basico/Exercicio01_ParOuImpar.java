package nivelbasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Bem vindo a contagem");

		System.out.println("Digite aqui o seu numero : ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("SEU NUMERO É PAR");
		}

		else {
			System.out.println("SEU NUMERO É IMPAR");
		}
		sc.close();
	}

}
