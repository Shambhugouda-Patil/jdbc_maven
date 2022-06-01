package com.ty.student.controller;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.Student;

public class TestStudent {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("pawan");
		student.setEmail("pawan@123");
		student.setPhone(1234567);
		
		StudentDao dao=new StudentDao();
		int res=dao.insertStudent(student);
		if(res>0)
		{
			System.out.println("added succesfully");
		}
		else
		{
			System.out.println("no data exist");
		}
		
		
	}

}
