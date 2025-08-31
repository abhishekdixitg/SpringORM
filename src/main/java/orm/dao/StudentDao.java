package orm.dao;

import java.util.List;

import orm.model.Student;

public interface StudentDao {

	public void insert(Student student);

	public List<Student> loadAll();
}
