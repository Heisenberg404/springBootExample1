package com.amh.converter;

import com.amh.entity.Course;
import com.amh.model.CourseModel;

public class CourseConverter {
	//entity to Model
	public CourseModel entityToModel(Course course){
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		return courseModel;
	}
	
	//Model to Entity
	public Course modelToEntity(CourseModel courseModel){
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		return course;
	}
}
