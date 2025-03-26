package com.listexample;
import java.util.ArrayList;
public class testexample {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Iphone 15",150000,"pune",7);
		Product p2 = new Product(1234, "samsubg z Fold",100000,"mumbai",4);
		Product p3 = new Product(564, "One+ 12R",90000,"Gangtok",10);
		Product p4 = new Product(101, "JBL Headset",5000,"Chandigarh",3);
		Product p5 = new Product(101, "BOAT sound bar",10000,"delhi",2);
		
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		for(Product p: list)
		{
			System.out.println("Product Description:");
			System.out.println(p.p_id+" "+p.p_name+" "+p.p_price);
			System.out.println(p.p_ship_add+" "+p.time_of_delivery);
			System.out.println(" ");
		}

	}

}
