package operators;

public class Ternary {

	public static void main(String[]args) {
		
		int a = 39;
		int b = 49;
		
	    int	result = a<b ? a:b;
	    
	    System.out.println(result);
	    
	    String gender = "Female";
	    System.out.println(gender.equals("Female")? "Hello Ms." : "Hello Mr.");
	    
	    int attendance = 85;
	
	 boolean isEligibleForExam = (attendance >= 75) ? true : false;
	 System.out.println(isEligibleForExam);
	 
	 boolean hasCoupon = true;
	 double totalBill = 500.00;
	
	 double finalPrice = (hasCoupon) ? (totalBill * 0.9) : totalBill;
	 System.out.println(finalPrice);
	 
	 int rank = 1;
	 char grade = (rank == 1) ? 'A' : 'B';
	 System.out.println(grade);
	}
	
	
	
}
