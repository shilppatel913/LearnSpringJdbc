package jdbcspring.springjdbc.dao;

import java.util.List;

import jdbcspring.springjdbc.Student;

public interface StudentDao {
	//sending data to the database
	public int insert(Student student);
	public int modify(Student student);
	public int delete(int studentId);
	
	//fetching data from the database
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	
}
