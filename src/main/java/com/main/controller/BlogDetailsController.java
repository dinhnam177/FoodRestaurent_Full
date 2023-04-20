package com.main.controller;

import com.main.constant.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = Constants.DEFAULT + Constants.BLOG)
public class BlogDetailsController {
    @RequestMapping(value = "/blog-details", method = RequestMethod.GET)
    public ModelAndView init(){
        return new ModelAndView("home/blog-details");
    }
}
