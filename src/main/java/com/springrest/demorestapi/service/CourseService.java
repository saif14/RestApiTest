package com.springrest.demorestapi.service;

import java.util.List;

import com.springrest.demorestapi.enitity.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(Long parseLong);

}
