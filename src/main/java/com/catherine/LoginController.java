package com.catherine;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Function: (登录控制器)
 *
 * @author lixin
 * @date 2018/4/28 13:49
 * @see
 */
@Controller
public class LoginController {

    /**
     * login (登录)
     *
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     * @author lixin
     * @date 2018/4/28 13:51
     */
    @GetMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "自我救赎之旅";
    }
}
