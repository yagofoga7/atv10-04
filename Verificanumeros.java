package estruturaCondicional;

import java.util.Scanner;

public class Verificanumeros {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Escolha um numero entre 1 e 3");
		int numero = ler.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O nuemro foi escolhido foi: 1.");
			break;
		case 2:
			System.out.println("O numero escolhido foi: 2.");
			break;
		case 3:
			System.out.println("O numero escolhido foi: 3.");
			break;

			default:
			System.out.println("O numero escolhido é invalido! Digite um numero entre 1 a 3. ");
		}
	}

}
