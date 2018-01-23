package com.itheima.web.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    
    public String save(){
        System.out.println("调用了UserAction的save方法~~~=======================");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        UserService userService = (UserService) context.getBean("userService");
        
        userService.save();
        
        return NONE;
    }

}
