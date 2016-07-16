package pl.andrzej.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Andrzej on 16.07.2016.
 */
@Controller
@RequestMapping(value="/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {

        modelMap.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

}
