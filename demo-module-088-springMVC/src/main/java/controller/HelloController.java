package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mvc")
public class HelloController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public ModelAndView hi() {
        ModelAndView modelAndView = new ModelAndView("hello");
//        model.addAttribute("message","Hello Spring MVC Framework!");
        modelAndView.addObject("message", "Hi Spring MVC Framework!");

        return modelAndView;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");

        return "hello";
    }

    @RequestMapping(value = "/param")
    public void param(HttpServletRequest request, HttpServletResponse response) {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        System.out.println(user);
        System.out.println(pwd);
    }

    @RequestMapping(value = "/param2")
    public void param2(@RequestParam("user") String userName, @RequestParam("pwd") String password) {
        System.out.println(userName);
        System.out.println(password);
    }

    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:/";
    }


    @RequestMapping("{name}")
    public @ResponseBody
    User getUser(@PathVariable String name) {

        User user = new User();

        user.setName(name);
        user.setPassword("0105");
        return user;
    }
}
