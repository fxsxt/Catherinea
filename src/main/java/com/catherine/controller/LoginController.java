package com.catherine.controller;

import com.catherine.model.vo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: (登录控制器)
 *
 * @author lixin
 * @date 2018/4/28 13:49
 * @see
 */
@Controller
public class LoginController {

    @Value(value = "${me}")
    public String me;

    @Value(value = "${lover}")
    public String lover;

    /**
     * login (登录)
     *
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     * @author lixin
     * @date 2018/4/28 13:51
     */
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("index");
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setAge(18);
        user1.setName("xiaoyu");
        User user2 = new User();
        user2.setAge(18);
        user2.setName("lixin");

        list.add(user1);
        list.add(user2);

        modelAndView.addObject("user",user1);
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @GetMapping(value = "/haha")
    @ResponseBody
    public String haha(){
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println(me+"love"+lover);
        return me+"love"+lover;
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "自我救赎之旅";
    }

    @RequestMapping(value = "/user")
public String user(@ModelAttribute("msg")String msg,String a ){
    System.out.println("lalal");
    throw new IllegalArgumentException("系统异常"+msg);
}




}
