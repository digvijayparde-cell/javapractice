package operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double percentage = 70.98f;
		String gender = "Female";
		String city = "Pune";

		boolean condition = percentage > 70 && gender == "Female" && city == "Pune";
		boolean condition2 = percentage > 80 || gender == "Male" || city == "Mumbai";
		
		System.out.println(condition);
		System.out.println(condition2);
	}

}
