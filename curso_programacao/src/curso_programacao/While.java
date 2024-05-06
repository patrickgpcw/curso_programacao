package curso_programacao;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// example while 
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int plus = 0;
		
		while (value != 0) {
			plus += value;
			value = sc.nextInt();
		}
		
		System.out.printf("A soma dos numeros digitados é %d ", plus);
		
		sc.close();

	}

}
