package curso_programacao;

public class ConditionalTenary {

	public static void main(String[] args) {
//		example condition ternary
		
		double price = 34.5;
		double discount = (price < 20) ? price * 0.1 : price * 0.05;
		
		System.out.println(discount);

	}

}
