package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class DoWhile{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius:");
			double C = sc.nextDouble();
			double F = 32 + (9 * C)/5;
			System.out.printf("Equivalente em Fahrenheint: %.1f%n", F);
			System.out.println("Deseja repetir?(s/n)");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		sc.close();
	}

}
