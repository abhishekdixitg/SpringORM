package orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import orm.model.Student;

public class StudentDaoImpl implements StudentDao {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getJdbcTemplate() {
		return hibernateTemplate;
	}

	@Override
	@Transactional
	public void insert(Student student) {

		hibernateTemplate.save(student);

	}

	@Override
	public List<Student> loadAll() {

		return hibernateTemplate.loadAll(Student.class);

	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
