package com.listexample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Arrlist_to_LINKedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Tata Nexon");
		cars.add("Mahindra Thar");
		cars.add("Toyota Fortuner");
		cars.add("Tata Nano");
		cars.add("Maruti ALTO");
		cars.add("Maruti Baleno");
		
		Collections.sort(cars);
		System.out.println(cars);
		
	/*	LinkedList<String> carlink = new LinkedList<String>(cars);
		
		carlink.add("BMW S 430");
		carlink.add("Marcedes G 200");
		System.out.println(carlink); */
				
		

	}

}
