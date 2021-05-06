package com.springrest.demorestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.demorestapi.enitity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
