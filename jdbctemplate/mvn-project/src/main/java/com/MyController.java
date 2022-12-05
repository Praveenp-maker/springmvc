package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * MyController
 */
@Controller

public class MyController {
    
    @RequestMapping("/")
    public String showform(Model m){    
        m.addAttribute("command", new User());  
        return "hey";   
    }    
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
   public int add(@ModelAttribute("user") User user){
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
          
    UserDao dao=(UserDao)ctx.getBean("edao");
    int status=dao.insertUser(user);  
    System.out.println(status); 
    return status;
}
}