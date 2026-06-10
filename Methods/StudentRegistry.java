public class StudentRegistry {

    public static void main(String[] args) {

        schname("ZP School");
        
        StudentRegistry st1 = new StudentRegistry();
        st1.name("Digvijay", "Parade", 11, 'A');

        StudentRegistry st2 = new StudentRegistry();
        st2.name("Virat", "Kohli", 49, 'F');
    }
    
    public static void schname(String schname) {
        System.out.println(schname);
    }

    public void name(String fstname, String lastname, int studentId, char studentRank) {
        System.out.println(fstname + " " + lastname);
        id(studentId);
        System.out.println(rank(studentRank));
    }

    public void id(int id) {
        System.out.println(id);
    }

    public char rank(char r) {
        return r;
    }
}