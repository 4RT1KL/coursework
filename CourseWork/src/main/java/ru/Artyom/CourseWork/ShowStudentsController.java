package ru.Artyom.CourseWork;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowStudentsController {
    @RequestMapping({"/students"})
    public ModelAndView students(ModelAndView model) {
        model.setViewName("students");
        model.addObject("studentIter", MainController.getAllStudents());
        return model;
    }
}
