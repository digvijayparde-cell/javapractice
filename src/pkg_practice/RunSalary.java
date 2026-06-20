package pkg_practice;


import pkg_testing.salary.Salary;

public class RunSalary {

    public static void main(String[] args) {
        System.out.println("Calling Salary class from pkg_practice:");
        
        
        Salary.salary(55000);
    }
}