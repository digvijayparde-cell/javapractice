package controlflow.ifelse;

public class Job {
	
	String candidateName;

	public Job(String name) {
		this.candidateName = name;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i <= 3 ; i++) {
			
			Job candidate = new Job("Candidate " + i);
			
			if (i == 1) {
				candidate.application(99.99, 8, 31, "Female");
			} else if (i == 2) {
				candidate.application(85.50, 4, 25, "Male");
			} else {
				candidate.application(99.99, 7, 28, "Male");
			}
		}
		
	
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
		
		System.out.println(candidateName + " "+"Congrulation your selected");
		
	}
	
	public void rejected() {
		
		System.out.println(candidateName + " "+"your rejected , better luch next time");
		
	}
}
