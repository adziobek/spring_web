package pl.andrzej.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Andrzej on 16.07.2016.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {

        modelMap.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public ModelAndView printHello2(ModelAndView modelAndView) {
        modelAndView.addObject("message", "Hello2");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
