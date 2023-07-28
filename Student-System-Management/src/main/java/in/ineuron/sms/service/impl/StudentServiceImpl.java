package in.ineuron.sms.service.impl;

import java.util.List;
import in.ineuron.sms.entity.Student;

import org.springframework.stereotype.Service;

import in.ineuron.sms.repository.IStudentRepository;
import in.ineuron.sms.service.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService{

	private IStudentRepository studentRepository;
	
	public StudentServiceImpl(IStudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}