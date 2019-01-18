package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EventController {

    @RequestMapping(value = "/")
    public String homePage(){
        return "homePage"; // View Name
    }

    @RequestMapping(value = "/event_page")
    public ModelAndView populateUser(@RequestParam("userName") String userName, @RequestParam("givenPassword") String password){
        User user= new User();
        user.setPassword(password);
        user.setuserName(userName);
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("eventPage");
        modelAndView.addObject("objectName",user.getuserName());
        return modelAndView;
    }
}
