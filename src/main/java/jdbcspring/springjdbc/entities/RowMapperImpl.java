package jdbcspring.springjdbc.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcspring.springjdbc.Student;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
