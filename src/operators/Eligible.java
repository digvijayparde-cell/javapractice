package operators;

public class Eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eligibility("Female",24);

	}
	
	public static void eligibility(String gender , int marks) {
		
		
		String status = gender == "Female" && marks > 99 ? "ELigible" : "Not Eligible";
		
		System.out.println(status);
	}

}
