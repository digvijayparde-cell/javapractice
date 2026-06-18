package pkg_testing;

public class Studentinfo {
    
    // Quick assumption of your variables based on your console output
    String schname = "Zp School";
    int schno = 22;

    public static void main(String[] args) {
        Studentinfo st1 = new Studentinfo();
        System.out.println(st1.schname);
        System.out.println(st1.schno);
        
        st1.name("Digvijay", "Parade");
        
        // This calculates the total, but we want to store it or print it
        int total = st1.totalmarks(89, 20, 35);
        System.out.println("Total Marks: " + total);
        
        System.out.println("--- Student Object Details ---");
        // Now this will cleanly print using your new toString() method!
        System.out.println(st1); 
    }

    public void name(String fsname, String lname) {
        System.out.println(fsname + " " + lname);
    }

    public int totalmarks(int eng, int maths, int sci) {
        return eng + maths + sci;
    }

    // --- ADDED TOSTRING METHOD HERE ---
    @Override
    public String toString() {
        return "School Name: " + schname + ", School No: " + schno;
    }
}