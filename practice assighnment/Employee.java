public class Employee {

       	int idValue;
    	String langValue;

    public static void main(String[] args) {

        compname("Asus");

        Employee emp1 = new Employee();
        emp1.idValue = 101;
        emp1.langValue = "java";
        emp1.empname("Raju", "Spate");

        Employee emp2 = new Employee();
        emp2.idValue = 102;
        emp2.langValue = "python";
        emp2.empname("Sham", "lpate");
	add(20.001,100000L);
    }

    public static void compname(String company) {
        System.out.println(company);
    }

    public void empname(String fsname, String lsname) {
        System.out.println(fsname + " " + lsname);
        
     
        empid(idValue);
        System.out.println(emplang(langValue));
    }

    public void empid(int id) {
        System.out.println(id);
    }

    public String emplang(String lang) {
        return lang;
    }
}