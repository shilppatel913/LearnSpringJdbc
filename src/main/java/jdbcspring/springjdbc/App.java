package jdbcspring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbcspring.springjdbc.entities.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcspring/springjdbc/config.xml");
//        JdbcTemplate template=context.getBean("jdbc1",JdbcTemplate.class);
//        System.out.println( "Program is running" );
//        String query="insert into student(id,name,city) values(?,?,?)";
//        int result=template.update(query,223,"Isha Sachdeva","Meerut");
//        System.out.println("Number of rows affected are"+result);
        
        //insert operation performed below;
        
      
//        Student student=new Student();
//        student.setId(225);
//        student.setName("Maurya Gohil");
//        student.setCity("Ahmedabad");
//        StudentDaoImpl s1=context.getBean("studentDao",StudentDaoImpl.class);
//        int result=s1.insert(student);
//        System.out.println("Number of rows affected are"+result);
        
        
        //performing update operation
//        Student student=new Student();
//        student.setId(223);
//        student.setName("Chavi Pathak");
//        student.setCity("Bhopal");
//        StudentDaoImpl s1=context.getBean("studentDao",StudentDaoImpl.class);
//        int result=s1.modify(student);
//        System.out.println("Number of rows modified"+result);
        
        //performing delete operation
        
        StudentDaoImpl s1=context.getBean("studentDao",StudentDaoImpl.class);
        int result=s1.delete(223);
        System.out.println("number of rows deleted are"+result);
    }
}
