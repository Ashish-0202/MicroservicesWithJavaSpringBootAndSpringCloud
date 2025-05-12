package com.microservices.StudentService.Repository;

import com.microservices.StudentService.Entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student,Long> {
}
