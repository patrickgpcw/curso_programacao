package curso_programacao;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int plus = 0;
		for(int i = 0 ; i<N ; i++ ) {
			int value = sc.nextInt();
			plus += value; 
		}
		System.out.println(plus);
		sc.close();
	}

}
