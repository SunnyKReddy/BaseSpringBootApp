package com.learnleadgrow.ut.TestingDemo.repository;

import com.learnleadgrow.ut.TestingDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
