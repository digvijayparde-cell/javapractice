package scannerTopic;

import java.util.*;

public class Master{
	
	String name;
	int id;
	String clgName;
	
	
	public Master(String name,int id) {
		
		this.name = name;
		this.id = id;
	}
	public Master(String clgname) {
		
		this.clgName = clgName;
	}
	public static void main(String []args) {
		
		Master obj = new Master("DD",22);
		obj.Method();
		Master obj1 = new Master("SVERI");
		obj1.Meth();
		
		
	}
	public void Method() {
		
		System.out.println(name+" "+id);
	}
public void Meth() {
		
		System.out.println(clgName);
	}
	
}

