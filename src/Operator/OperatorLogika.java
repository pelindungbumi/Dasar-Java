package Operator;

public class OperatorLogika {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c;
	
		// konjungsi (dan)
		c = a && b;
		System.out.println("true dan false = " + c);

		// disjungsi (atau)
		c = a || b;
		System.out.println("true atau false = " + c);

		// negasi (bukan/kebalikan)
		System.out.println("true dan false = " + !a);
		
	}
}