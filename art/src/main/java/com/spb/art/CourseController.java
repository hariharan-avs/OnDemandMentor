package com.spb.art;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/api/course")
	public String getAllCourse() {
		return "Courses List";
				/* Arrays.asList(new Course(1l, "Java Full Stack Course", "Author", "Mentor", "Details - Full stack Course", "PreRequisites - Basics")) >>> target='_blank'; */
		
	}
}
