package operators;

public class UnaryTrick {

	public static void main(String[] args) {
		int m = 999;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		System.out.println(m++ + --n);
	}
}