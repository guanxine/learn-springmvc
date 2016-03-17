package cn.gx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by always on 16/3/16.
 */

@Controller
@RequestMapping("/helloController")//all handling methods on this controller,relative to the /helloController path
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    //as the controller's default service method to handle HTTP GET request
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

//    @RequestMapping("/simple")
//    public String simple(){
//
//        return "redirect:/pages/simple.html";
//    }
}
