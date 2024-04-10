package estruturaCondicional;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		double anos,bonus,salario;

		Scanner ler = new Scanner (System.in);
		System.out.println("Informe quantos anos voce trabalha: ");
		anos = ler.nextDouble();
		if (anos >3) {
			System.out.println("Voce de receber um bonus de 7%");
		}
		else {
			System.out.println("Voce deve receber 5% de bonus");

		}

	}

}
