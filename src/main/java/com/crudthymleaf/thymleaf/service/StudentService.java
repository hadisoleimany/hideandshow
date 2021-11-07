package com.crudthymleaf.thymleaf.service;

import com.crudthymleaf.thymleaf.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList(){
        List<Student> students=new ArrayList<>();

        students.addAll(
                Arrays.asList(new Student(1L,"hadi","soleimany","10"),
                        new Student(2L,"ali","soleimany","11")));
        return students;
    }
}
