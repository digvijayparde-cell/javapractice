package controlflow.loopingstmt;

public class Payment {

	public static void main(String[] args) {
		
		int[] salaries = {30000, 45000, 50000, 28000, 60000};
		
		for (int i = 0; i < salaries.length; i++) {
		
			double newsalary = salaries[i] + (salaries[i] * 0.10);
			
			System.out.println("Emp " + (i + 1) + newsalary);
		}// ...
	}
}