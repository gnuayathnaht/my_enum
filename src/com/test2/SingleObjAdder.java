package com.test2;

public class SingleObjAdder {

	
	private SingleObj singleObj;
	
	public SingleObjAdder() {
		// TODO Auto-generated constructor stub
		singleObj = SingleObj.getOneInstance();
	}
	
	public void add(String str) {
		singleObj.add(str);
		System.out.printf("%s is added%n", str);
	}
}
