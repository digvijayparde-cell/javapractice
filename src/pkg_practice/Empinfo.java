package pkg_practice;
import pkg_testing.Emp;
public class Empinfo {

	public static void main(String[]args) {
		
		Emp emp1 = new Emp();
		Emp.companyName("TCS");
		emp1.empName("Jhon","Doe");
		emp1.empId(102);
		System.out.println(emp1.empLang("Python"));
		
		
	}
	
	
	
}
