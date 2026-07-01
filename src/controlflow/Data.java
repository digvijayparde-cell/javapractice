package controlflow;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data person1 = new Data();
		Data person2 = new Data();
		person1.ticket("Swara","Female",23);
		person2.ticket("Nanu","Male",24);
		

	}
	public void ticket(String name,String gender,int age) {
		
if((age >=1 && age <= 150)&&(gender == "Female")) {
			
			System.out.println(name+" "+"Half Ticket");	
		}
		else if((age >=16 && age <= 60)&&(gender == "Male")){
			
			System.out.println(name+" "+"Full ticket");	
		}

	}
	

}
