package array;

import java.util.*;

public class Arr {

	
	int id;
	int price;
	String name;
	
	public Arr (int id,int price,String name) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		
		
	}
	
	public static void main(String[] args) {
		
		Arr [] productdetails = new Arr[5];
		
		productdetails[0] = new Arr(29,78500,"Iphone");
	
		
		productInformation(productdetails[0]);
		
		ArrayList <Arr> info = new ArrayList<> ();
		
		info.add(new Arr(29,78500,"Iphone"));
	}
	public static void productInformation(Arr product) {
		
		System.out.println(product.id);
		System.out.println(product.price);
		System.out.println(product.name);
		
	}
	
}
