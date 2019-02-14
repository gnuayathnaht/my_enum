package com.test1;

public class CourseTest {

	
	public static void main(String[] args) {
		
		Courses[] courses = Courses.values();
		
		for (Courses course : courses) {
			
			System.out.println(course.toString());
			System.out.println(course.getValue());
			System.out.printf("%s : %d MMK%n", course.toString(),course.showFees());
			course.showAmountFees();
			System.out.println();
		}
	}
}
