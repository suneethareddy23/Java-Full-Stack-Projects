package in.ineuron.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.sms.entity.Student;


public interface IStudentRepository extends JpaRepository<Student, Long> {

}
