package in.ineuron.sms.service;
import in.ineuron.sms.entity.Student;

import java.util.List;

public interface IStudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}