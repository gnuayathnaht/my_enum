package com.test2;

public class SingleObjTest {

	
	public static void main(String[] args) {
		
		
		SingleObjAdder adder = new SingleObjAdder();
		adder.add("Than Htay Aung");
		adder.add("My Family");
		adder.add("Su Htet Thar Htwe");
		
		SingleObj single = SingleObj.getOneInstance();
		for (String name : single.getName()) {
			System.out.println(name);
		}
	}
}
