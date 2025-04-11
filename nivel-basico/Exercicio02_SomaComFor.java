package nivelbasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Bem-vindo à matemática");

		System.out.println("Digite um número");
		int numero = sc.nextInt();

		System.out.printf("A soma os numeros digitados é : %d%n", numero);

		int somaTotal = 0;
		for (int i = 1; i <= 15; i++) {
			int conta = numero + i;
			somaTotal += conta;
			System.out.printf("%d + %d = %d%n", numero, i, conta);
		}
		System.out.printf("Soma total das operações: %d%n", somaTotal);

		sc.close();
	}
}
