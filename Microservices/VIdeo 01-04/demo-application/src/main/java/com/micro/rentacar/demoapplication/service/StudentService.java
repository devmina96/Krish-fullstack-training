package com.micro.rentacar.demoapplication.service;

import com.micro.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
