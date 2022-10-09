package jdbcspring.springjdbc.dao;

import jdbcspring.springjdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	public int modify(Student student);
	public int delete(int studentId);
	
}
