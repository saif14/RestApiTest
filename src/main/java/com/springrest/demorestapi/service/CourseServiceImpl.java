package com.springrest.demorestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.demorestapi.dao.CourseDao;
import com.springrest.demorestapi.enitity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(145, "Java", "It contains basics of Java"));
//		list.add(new Course(146, "Java Spring", "It contains basics of Rest API in spring boot"));
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
	
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;		
//			}
//				
//		}
		return courseDao.getOne(courseId);
	}

	@Override 
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		
//		list.forEach(e ->{
//			if(e.getId( == course.getId)) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		})
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	public void deleteCourse(Long parseLong) {
		// TODO Auto-generated method stub
		Course courseEntity = courseDao.getOne(parseLong);
		courseDao.delete(courseEntity);
		
	}
	

}
