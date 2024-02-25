package ru.Artyom.CourseWork;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String surname;
    private String name;
    private String student_code;
    private Integer student_activity_rating;
  
    public Integer getId() {
      return id;
    }
  
    public void setId(Integer id) {
      this.id = id;
    }
  
    public String getSurname() {
      return surname;
    }
  
    public void setSurname(String surname) {
      this.surname = surname;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }

    public String getStudentCode() {
      return student_code;
    }
  
    public void setStudentCode(String student_code) {
      this.student_code = student_code;
    }

    public Integer getStudentActivityRating() {
      return student_activity_rating;
    }
  
    public void setStudentActivityRating(Integer student_activity_rating) {
      this.student_activity_rating = student_activity_rating;
    }
}