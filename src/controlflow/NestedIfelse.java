package controlflow;

public class NestedIfelse {

	public static void main(String[]args) {
		
		NestedIfelse c1 = new NestedIfelse();
		NestedIfelse c2 = new NestedIfelse();
		NestedIfelse c3 = new NestedIfelse();
		NestedIfelse c4 = new NestedIfelse();
		c1.ruBatman("Nanu","Male",23);
		c2.ruBatman("Swara","Female",23);
		c3.ruBatman("Nikki","Female",16);
		c4.ruBatman("Raj","Male",16);
		c1.ruBatman("Pandu","Male",23);
		
	}
public void ruBatman(String name ,String gender,int age) {
	
	if(gender == "Female") {
		
		if(age >= 18) {
			System.out.println(name+" "+"Your a Wonder Woman");
			
		}
		else {
			System.out.println(name+" "+"is a Still Kid");
		}
	}
	else if (gender == "Male"&& age >= 18){
		System.out.println(name+" "+"Your The Batman");
	}
	else {
		System.out.println(name+" "+"is a Still Kid");
	}
}
}


