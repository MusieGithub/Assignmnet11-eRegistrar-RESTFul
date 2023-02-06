package edu.miu.cs.cs425.student.service.serviceimpl;

import edu.miu.cs.cs425.student.model.Student;
import edu.miu.cs.cs425.student.repository.StudentRepository;
import edu.miu.cs.cs425.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student addNewStudent(Student newStudnet) {
        return studentRepository.save(newStudnet);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Long studentId) {
        Student updatedStudent =Student.build(studentId, student.getStudentNumber(), student.getFirstName(),student.getMiddleName(), student.getLastName(), student.getCgpa(), student.getDateOfEnrollment(), student.getIsInternational());
        return studentRepository.save(updatedStudent);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> findStudentByName(String searchString) {
        return studentRepository.findAllByFirstNameContainingOrLastNameContaining(searchString,searchString);
    }


}
