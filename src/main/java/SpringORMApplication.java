import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orm.dao.StudentDao;
import orm.model.Student;

public class SpringORMApplication {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student stud = new Student();
		stud.setId("20304");
		stud.setName("ORM Abhishek");

		studentDao.insert(stud);

		List<Student> studList = studentDao.loadAll();

		System.out.println(studList);

	}
}
