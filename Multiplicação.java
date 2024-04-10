package estruturaCondicional;
import java.util.Scanner;
public class Multiplicação {

	public static void main(String[] args) {
		double a;

		Scanner ler = new Scanner (System.in);

		System.out.println("Informe um valor:");

		a = ler.nextDouble ();

		String msg = a % 5 == 0 ? "O numero" + a + "é multiplo de 5" : "Não é muliplo de 5";

		System.out.println(msg); //

	}


}


