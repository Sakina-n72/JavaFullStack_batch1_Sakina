package com.tms;

import java.util.ArrayList;
import java.util.List;

public interface CourseService {
	String addCourse(Course c);
	String deleteCourse(Integer id);
	String updateCourse(Integer id);
	List<Course> listCourse();
}

class CourseServiceImp implements CourseService{
	List<Course> courseList = new ArrayList<>();
	public String addCourse(Course c) {
		courseList.add(c);
		return "Course Added";
	}
	public String deleteCourse(Integer id) {
		Iterator i = courseList.iterator(10)
	}
	public String updateCourse(Integer id) {
		
		return "Course Updated";
		
	}
	public List<Course> listCourse(){
		return courseList;
		
	}
}