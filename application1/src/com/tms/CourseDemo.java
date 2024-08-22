package com.tms;

import java.util.Arrays;
import java.util.List;

public class CourseDemo {
	public static void main(String[] args) {
		Course c1 = new Course(10, "java", 5000.0);
		Course c2 = new Course(20, "javaScript", 5000.0);
		
		CourseService cs = new CourseServiceImp();
		System.out.println(cs.addCourse(c1));
		System.out.println(cs.addCourse(c2));
		
		//System.out.println(cs.deleteCourse(1));
		
		List<Course> returnedList = cs.listCourse();
		
		for(Course c:returnedList)
			System.out.println(c);
		
	}

}

