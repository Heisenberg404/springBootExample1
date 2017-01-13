package com.amh.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.amh.entity.Course;
import com.amh.entity.QCourse;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDslExampleRepo")
public class QueryDslExampleRepo {
	private QCourse qCourse = QCourse.course;
	@PersistenceContext
	private EntityManager em;
	
	public void find(){
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		Course course1 = query.select(qCourse).from(qCourse).where(qCourse.id.eq(23)).fetchOne();
	
	}

}
