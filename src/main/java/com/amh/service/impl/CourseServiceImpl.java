package com.amh.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amh.entity.Course;
import com.amh.repository.CourseJpaRepository;
import com.amh.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService{

	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public List<Course> lisctAllCourses() {
		LOG.info("call: lisctAllCourses()");
		return courseJpaRepository.findAll();
		
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("call: addCourse()");
		return courseJpaRepository.save(course);
		
	}

	@Override
	public int removeCourse(int id) {
		LOG.info("call: removeCourse()");
		courseJpaRepository.delete(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		LOG.info("call: updateCourse()");
		return courseJpaRepository.save(course);
		
	}

}
