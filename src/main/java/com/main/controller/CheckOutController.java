package com.main.controller;

import com.main.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = Constants.DEFAULT)
public class CheckOutController {
    @RequestMapping(value = "/check-out", method = RequestMethod.GET)
    public ModelAndView init(){
        return new ModelAndView("home/checkout");
    }
}
