package com.amh.service;

import java.util.List;

import com.amh.entity.Course;

public interface CourseService {
	public abstract List<Course>  lisctAllCourses();
	public abstract Course addCourse(Course course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
}
