package ru.Artyom.CourseWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class MainController {
  @Autowired
  private static UserRepository userRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewStudent (@RequestParam String surname
      , @RequestParam String name) {

    Student n = new Student();
    n.setSurname(surname);
    n.setName(name);
    try {
      userRepository.save(n);
      return "Saved";
    } catch (Exception e) {
      return "Failed. Error: " + e.getMessage();
    }
  }

  @GetMapping(path="/all")
  public static @ResponseBody Iterable<Student> getAllStudents() {
    return userRepository.findAll();
  }
}