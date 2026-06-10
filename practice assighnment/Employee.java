public class Employee{

	public static void main(String[]args){

		Employee emp1 = new Employee();
		compname("Asus");
		emp1.empname("Raju","Apate");
		emp1.empid(101);
		System.out.println(emp1.emplang("java"));

	}

		public static void compname(String company){
			System.out.println(company);

	}

		public void empname(String fsname,String lsname){
			System.out.println(fsname+" "+lsname);
	
	}

		public void empid(int id){

			System.out.println(id);

	}

		public String emplang(String lang){

			return lang;


	}
	
}