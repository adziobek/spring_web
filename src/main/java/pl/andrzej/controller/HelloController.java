package pl.andrzej.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.andrzej.bean.PasswordData;
import pl.andrzej.bean.PasswordResponse;
import pl.andrzej.bean.Student;

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

    @GetMapping(value = "/hello2")
    public ModelAndView printHello2(ModelAndView modelAndView) {
        modelAndView.addObject("message", "Hello2");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "/searchCustomer/customerId/{customerId}/msisdn/{msisdn}", method = RequestMethod.GET)
    public ModelAndView searchCustomer(@PathVariable String customerId, @PathVariable("msisdn") String phoneNumber, ModelAndView modelAndView) {

        modelAndView.addObject("customerId", customerId);
        modelAndView.addObject("phoneNumber", phoneNumber);

        modelAndView.setViewName("search");
        return modelAndView;
    }

    @RequestMapping(value = "/product")
    public ModelAndView getProduct(@RequestParam("productName") String productName, ModelAndView modelAndView) {

        modelAndView.addObject("productName", productName);
        modelAndView.setViewName("product");

        return  modelAndView;
    }

    @RequestMapping("/simpleResponse")
    @ResponseBody
    public String getPlainResponse() {

        return "Used @ResponseBody";
    }

    @RequestMapping(value = "/student")
    @ResponseBody
    public Student getStudent() {

        return new Student(23, "Andrzej", "Duda");
    }

    @RequestMapping(value = "/changePasswordForm")
    public ModelAndView changePasswordForm(ModelAndView modelAndView) {

        modelAndView.setViewName("changePasswordForm");
        return modelAndView;
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    @ResponseBody
    public PasswordResponse changePassword(@RequestBody PasswordData passwordData) {

        return new PasswordResponse("OK", "Hasło zostało zmienione poprawnie");
    }
}