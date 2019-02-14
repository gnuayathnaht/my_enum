package com.test3;

public enum MyanmarMoney {

	ONE(1), FIVE(5), TEN(10), FIFTY(50),
	HUNDRED(100), TWO_HUNDRED(200),FIVE_HUNDRED(500),
	THOUSAND(1000), FIVE_THOUSAND(5000), TEN_THOUSAND(10000);
	
	private int value;

	private MyanmarMoney(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String res = "";
		String [] strs =
		super.toString().split("_");
		for(String str : strs) {
		res += str.toLowerCase();
		res += " ";
		}
		res += "kyat";
		return res;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		MyanmarMoney[] myMoney = MyanmarMoney.values();
		
		for (MyanmarMoney myanmarMoney : myMoney) {
			System.out.println(myanmarMoney);
		}
	}
}
