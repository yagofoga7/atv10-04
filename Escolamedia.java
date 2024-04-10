package estruturaCondicional;

import java.util.Scanner;

public class Escolamedia {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		Double notaa, notab, notac, notad, som, div;

		System.out.println("Qual sua primeira nota?");
		notaa = ler.nextDouble();
		
		System.out.println("Qual sua segunda nota?");
		notab = ler.nextDouble();
		
		System.out.println("Qual sua terceira nota?");
		notac = ler.nextDouble();
		
		System.out.println("Qual sua quarta nota?");
		notad= ler.nextDouble();
		
		som = notaa+notab+notac+notad;
		div = som /4;
				
		

		
		if(div <= 6)
			System.out.println("Que pena, você está reprovado "+div);
		
		else {
			System.out.println("Parabens você esta aprovado "+div);
		}
		
		ler.close();

	}

}
