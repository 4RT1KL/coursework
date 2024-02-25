package ru.Artyom.CourseWork;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Student, Integer> {

}