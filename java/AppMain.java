import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.Studentmanagment.entity.Student;
import com.greatlearning.Studentmanagment.service.StudentService;
import com.greatlearning.Studentmanagment.service.StudentServiceImpl;


public class AppMain {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = con.buildSessionFactory();
		StudentService studentService = new StudentServiceImpl(sessionFactory);
		List<Student> StudentList = studentService.findAll();
		for (Student student : StudentList) {
			System.out.println(student.toString());
		}
	}
}
