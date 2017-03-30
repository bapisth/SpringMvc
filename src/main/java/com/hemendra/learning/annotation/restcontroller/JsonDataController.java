package com.hemendra.learning.annotation.restcontroller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hemendra.learning.annotation.model.Student;
import com.hemendra.learning.annotation.services.StudentServices;

@Controller
@RequestMapping(value="/json-data")
public class JsonDataController {
	
	/**
	 * here In the below method we are getting an error
	 * org.springframework.web.util.NestedServletException: Request processing failed; 
	 * nested exception is java.lang.IllegalArgumentException: 
	 * No converter found for return value of type: class java.util.ArrayList
	 *
	 *To resolve this issue I am adding "com.fasterxml.jackson.core" in the pom, 
	 *which works as the message converter, 
	 *this message conversion is taken care by the Spring Framework itself
	 *
	 *ALSO add "jackson-databind" in the pom to avoid the error " 406 Not Acceptable"
	 *
	 *http://stackoverflow.com/questions/16335591/spring-mvc-json-406-not-acceptable
	 *http://stackoverflow.com/a/36493910
	 * @return
	 */
	@RequestMapping(value = "/student", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody
	public List<Student> getAllStudent(){
		return StudentServices.getAllStudents();
	}
	

}
