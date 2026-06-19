package pkg_practice;

import pkg_testing.Studentinfo;

public class TestStudent {

    public static void main(String[] args) {
        Studentinfo st = new Studentinfo();
        
        st.name("Arjun", "Sharma");
        System.out.println(st.id(103));
        System.out.println(st.totalmarks(85, 90, 92));
    }
}