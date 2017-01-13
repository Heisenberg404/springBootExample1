package com.amh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.amh.component.RequestTimeInterceptor;
import com.amh.model.Person;
import com.amh.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Mike", 23));
		people.add(new Person("Jon", 26));
		people.add(new Person("Michael", 45));
		people.add(new Person("Tom", 22));
		people.add(new Person("Dominic", 55));
		people.add(new Person("Stuart", 32));
		LOG.info("hello from service");
		return people;
	}

}
