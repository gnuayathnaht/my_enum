package com.test2;

public class SingleObj {

	
	private String[] name;
	
	private static SingleObj oneInstance;
	
	public static SingleObj getOneInstance() {
		
		if(oneInstance == null) {
			oneInstance = new SingleObj();
		}
		return oneInstance;
	}

	private SingleObj() {
		super();
		this.name = new String[0];
	}
	
	public void add(String str) {
		
		String[] temp = new String[name.length+1];
		
		for (int i = 0; i < name.length; i++) {
			temp[i] = name[i];
		}
		
		temp[temp.length-1] = str;
		
		name = temp;
	}
	
	public String[] getName() {
		return name;
	}
	
}
