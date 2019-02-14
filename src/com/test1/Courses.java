package com.test1;

public enum Courses implements FeesShowablePrice{
	
	JavaSE(150000) {
		@Override
		public int showFees() {
			// TODO Auto-generated method stub
			return getValue();
		}

		@Override
		public void showAmountFees() {
			// TODO Auto-generated method stub
			System.out.printf("%s course fees is %d MMK%n", Courses.valueOf("JavaSE"),getValue());
		}
	}, JavaEE(300000) {
		@Override
		public int showFees() {
			// TODO Auto-generated method stub
			return getValue();
		}

		@Override
		public void showAmountFees() {
			// TODO Auto-generated method stub
			System.out.printf("%s course fees is %d MMK%n", Courses.valueOf("JavaEE"),getValue());
		}
	}, Spring(300000) {
		

		@Override
		public void showAmountFees() {
			// TODO Auto-generated method stub
			System.out.printf("%s course fees is %d MMK%n", Courses.valueOf("Spring"),getValue());
		}

		@Override
		public int showFees() {
			// TODO Auto-generated method stub
			return getValue();
		}
	};
	
	private int value;

	private Courses(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public abstract int showFees();
}
