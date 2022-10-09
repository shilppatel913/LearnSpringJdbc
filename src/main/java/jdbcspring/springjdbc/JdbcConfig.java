package jdbcspring.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jdbcspring.springjdbc.entities.StudentDaoImpl;

//this is our configuration class so instead of using xml we can create beans in here
//you can also the annotation  @Component above in class studentDaoImpl so that you dont need to create a bean for that class
//And you can use autowiring in the studentDaoImpl class above the template property.

@Configuration
public class JdbcConfig {
	@Bean(name= {"driver1"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		d.setUsername("root");
		d.setPassword("Sql@1234");
		return d;
	}
	@Bean(name= {"jdbc1"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate j=new JdbcTemplate();
		j.setDataSource(getDataSource());
		return j;
	}
	@Bean(name= {"studentDao"})
	public StudentDaoImpl getStudentDao() {
		StudentDaoImpl s=new StudentDaoImpl();
		s.setTemplate(getTemplate());
		return s;
	}
}
