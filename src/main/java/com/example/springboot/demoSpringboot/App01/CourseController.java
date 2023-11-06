package com.example.springboot.demoSpringboot.App01;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "OS", "AA"),
				new Course(2, "CN", "AY"),
				new Course(3, "DBMS", "AU")
				);
	}
}
