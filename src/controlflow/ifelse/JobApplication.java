package controlflow.ifelse;

public class JobApplication {

    public static void main(String[] args) {
        JobApplication cand1 = new JobApplication();
        
        cand1.application("cand1", 100, 200, 31, "Female");
    }

    public void application(String name, double percentage, int experience, int age, String gender) {
       
        if (percentage == 99.99 && experience > 6 && (age <= 30 || gender.equals("Female"))) {
            selected(name);
        } else {
            rejected(name);
        }
    }

    public void selected(String name) {
        System.out.println(name + " Congratulations, you are selected!");
    }

    public void rejected(String name) {
        System.out.println(name + " you are rejected, better luck next time.");
    }
}
