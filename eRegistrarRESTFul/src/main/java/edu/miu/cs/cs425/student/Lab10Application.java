package edu.miu.cs.cs425.student;

import edu.miu.cs.cs425.student.model.Student;
import edu.miu.cs.cs425.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Lab10Application implements CommandLineRunner {
    @Autowired
    StudentService studentService;
    public static void main(String[] args) {
        SpringApplication.run(Lab10Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Started");
   System.out.println("Application Successfully ended");

    }
}
