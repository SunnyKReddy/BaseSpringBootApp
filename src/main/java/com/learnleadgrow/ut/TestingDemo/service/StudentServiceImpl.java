package com.learnleadgrow.ut.TestingDemo.service;

import com.learnleadgrow.ut.TestingDemo.model.Address;
import com.learnleadgrow.ut.TestingDemo.model.Student;
import com.learnleadgrow.ut.TestingDemo.repository.AddressRepository;
import com.learnleadgrow.ut.TestingDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    private StudentRepository studentRepository;
    private AddressRepository addressRepository;

    public StudentServiceImpl(StudentRepository studentRepository, AddressRepository addressRepository) {
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public Student createStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        List<Address> addressList = savedStudent.getAddress();
        for(Address address: addressList) {
            address.setStudent(savedStudent);
        }
        if(!(addressList == null)) {
            addressRepository.saveAll(addressList);
        }
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Deleted Successfully!";
    }
}
