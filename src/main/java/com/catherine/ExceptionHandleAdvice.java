package com.catherine;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Function: (这里用一句话描述这个类的作用)
 *
 * @author lixin
 * @date 2018/5/4 16:14
 * @see
 */
@ControllerAdvice
public class ExceptionHandleAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e , WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg",e.getMessage());
        return modelAndView;
    }




}
