package edu.miu.cs.cs425.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@AllArgsConstructor(staticName = "build")
@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentNumber;

    private String firstName;
    private String middleName;

    private String lastName;

    private Double cgpa;

    private LocalDate dateOfEnrollment;

    public Student() {

    }

//    private Boolean isInternational;



//    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment, Boolean isInternational) {
//        this.studentId = studentId;
//        this.studentNumber = studentNumber;
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.cgpa = cgpa;
//        this.dateOfEnrollment = dateOfEnrollment;
//        this.isInternational=isInternational;
//    }

//    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                '}';
    }
}
