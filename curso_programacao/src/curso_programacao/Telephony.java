package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Telephony {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutes = sc.nextInt();
		double accont = 50.0;
		
		//	Assignment Operators example
		
		if (minutes > 100) {
		
			accont += (minutes - 100)*2.0; 
		}
		System.out.printf("Valor da Conta R$ %.2f%n", accont);
		
		
		sc.close();

	}

}
