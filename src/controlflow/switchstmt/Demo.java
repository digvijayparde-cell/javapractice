package controlflow.switchstmt;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 6 ;
		String dayname = "fri";
		
		switch(day) {
		
		case 1 : 
			System.out.println("mon");
			break;
			
		case 2 :
			System.out.println("tue");
			break;
			
		case 3 :
			System.out.println("wed");
			break;
			
		case 4 :
			System.out.println("thu");
			break;
			
		case 5 :
			System.out.println("fri");
			break;
			
		case 6 :
			System.out.println("sat");
			break;
			
		case 7 :
			System.out.println("sun");
			break;
			
			default :
				System.out.println("invalid input");
		
		}
		
switch(dayname) {
		
		case "mon" : 
			System.out.println("mon");
			break;
			
		case "tue" :
			System.out.println("tue");
			break;
			
		case "wed" :
			System.out.println("wed");
			break;
			
		case "thu" :
			System.out.println("thu");
			break;
			
		case "fri" :
			System.out.println("fri");
			break;
			
		case "sat":
			System.out.println("sat");
			break;
			
		case "sun" :
			System.out.println("sun");
			break;
			
			default :
				System.out.println("invalid input");
		
		}

	}

}
