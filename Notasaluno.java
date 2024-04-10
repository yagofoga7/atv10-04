package estruturaCondicional;

import java.util.Scanner;

public class Notasaluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double nota1,nota2,nota3,nota4,media;

		System.out.println("Informe primeira nota");
		nota1 = ler.nextDouble();

		System.out.println("Informe a segunda nota");
		nota2 = ler.nextDouble();

		System.out.println("Informe terceira nota");
		nota3 = ler.nextDouble();

		System.out.println("Informe quarta nota");
		nota4 = ler.nextDouble();

		media = (nota1+nota2+nota3+nota4)/4;

		String msg = media >=6 ? "Voce esta aprovado,media:" +media :"Voce foi reprovado:" +media;

		System.out.println(msg); // "Voce esta reprovado!"

		ler.close ();
	}

}
