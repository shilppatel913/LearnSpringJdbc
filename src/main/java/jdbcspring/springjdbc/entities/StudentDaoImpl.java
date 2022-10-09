package jdbcspring.springjdbc.entities;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbcspring.springjdbc.Student;
import jdbcspring.springjdbc.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate template;
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student values(?,?,?)";
		int r=this.template.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int modify(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=? , city=? where id =?";
		int result=this.template.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int result=this.template.update(query,studentId);
		return result;
	}
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
