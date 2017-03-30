package com.hemendra.learning.annotation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hemendra.learning.annotation.model.Student;

public class StudentServices {
	private static List<Student> students = new ArrayList<>();
	
	public static List<Student> getAllStudents(){
		Student student = null;
		for(int i=0; i< 10; i++){
			student = new Student();
			student.setName(generateRandomString());
			student.setMobileNum(""+new Random(100000L).nextInt(100));
			student.setRollNum(new Random().nextInt(1000));
			
			students.add(student);
		}
		return students;
	}
	
	private static String generateRandomString(){
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		return output;
	}

}
