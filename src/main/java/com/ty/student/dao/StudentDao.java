package com.ty.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.student.dto.Student;

public class StudentDao {
	
	public int insertStudent(Student student)
	{
			Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/maven_jdbc_student", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setInt(4,student.getPhone());
			
			return preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
