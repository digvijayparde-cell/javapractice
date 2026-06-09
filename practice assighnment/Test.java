public class Test{

	static String school = "zp hsc";
	static String result = "Result";
	String name;
	short id;
	int subMath;
	int subEng;

	public static void main(String[]args){


		s1();
		Test st = new Test();
		System.out.println(st.s2());

	}


		public static void s1(){

			Test st1 = new Test();

			st1.name = "nanu";
			st1.id = 29;
			st1.subMath = 35;
			st1.subEng = 35;
			
			System.out.println(school);
			System.out.println(result);
			System.out.println("st1:"+" "+st1.name);
			System.out.println("st1ID:"+" "+st1.id);
			System.out.println("Math:"+" "+st1.subMath);
			System.out.println("Eng:"+" "+st1.subEng);

	}


		public String s2(){

			Test st2 = new Test();

			st2.name = "Digvijay";
			st2.id = 39;
			st2.subMath = 69;
			st2.subEng = 96;
			
			System.out.println(school);
			System.out.println(result);
			System.out.println("st2:"+" "+st2.name);
			System.out.println("st2ID:"+" "+st2.id);
			System.out.println("Math:"+" "+st2.subMath);
			System.out.println("Eng:"+" "+st2.subEng);

			String over = s3();
		
		return s3();
	
	}

		public static String s3(){

			Test st3 = new Test();
			
			st3.name = "Shubham";
			st3.id = 44;
			st3.subMath = 80;
			st3.subEng = 90;
			
			System.out.println(school);
			System.out.println(result);
			System.out.println("st3:"+" "+st3.name);
			System.out.println("st3ID:"+" "+st3.id);
			System.out.println("Math:"+" "+st3.subMath);
			System.out.println("Eng:"+" "+st3.subEng);

		return "Test over";
	}



}