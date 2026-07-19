
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt();
		
		halfCalc(intNum);
		
	}
	public static void halfCalc(int num) {
		
		 double result = (int)(num / 2.0 );
		 
		 System.out.println(result);
		
	}

}
