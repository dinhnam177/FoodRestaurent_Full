package com.main.controller;

import com.main.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = Constants.DEFAULT)
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    private ModelAndView init(){
        return new ModelAndView("home/index");
    }
}
