package com.kvscode.restapi.restcontroller;

import java.util.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvscode.restapi.entity.Student;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
     
    @PostConstruct
    public void loadData()
    {
        theStudents=new ArrayList<>();
        theStudents.add(new Student("kvs","Mani"));
        theStudents.add(new Student("Bavigadda","Prudhvi"));
        theStudents.add(new Student("Ajith","Varma"));
    }

    //for retriveing the student data for particular index variable names have to be matched 
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        //check student id 
        if(studentId>theStudents.size() || studentId<0)
        {
            throw new StudentNotFoundException("student id is not found "+ studentId);
        }
        //indexing to the list 

        return theStudents.get(studentId);
    }
    
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return theStudents;
    }
}
