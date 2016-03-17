package cn.gx.controller;

import cn.gx.Student;
import cn.gx.exception.SpringException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by guan_x on 2016/3/17.
 */
@Controller
public class StudentController {

    @RequestMapping("/student")
    public String student(){
       return "student";
    }

    @RequestMapping(value = "/addStudent")
    public String addStudent(Student student,ModelMap model) {

        if(student.getName().length() < 5 ){
            throw new SpringException("Given name is too short");
        }else{
            model.addAttribute("name", student.getName());
        }

        if( student.getAge() < 10 ){
            throw new SpringException("Given age is too low");
        }else{
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("id", student.getId());

        return "result";
    }
}
