package controlflow;

public class JobApplication {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JobApplication cand1 = new JobApplication();
		cand1.application(100, 200, 31, "Female");
		
		
	
	}
	
	public void application(double percentage,int experience,int age,String gender) {
		
if(percentage == 99.99 && experience > 6 && (age <= 30 || gender == "Female")) {
			
			selected();
			
		}

else {
	
	rejected();
}

}
	
	public void selected() {
		
		System.out.println("Congrulation your selected");
		
	}
	
	public void rejected() {
		
		System.out.println("your rejected , better luch next time");
		
	}
}
