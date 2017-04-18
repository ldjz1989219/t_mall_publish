package com.atguigu.crud.contoller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.crud.entity.User;
import com.atguigu.crud.service.UserService;

@Controller
@Scope(value="prototype")
@RequestMapping(value="/user")
public class Handler {
@Autowired
private UserService userservice;
@RequestMapping(value="/login",method=RequestMethod.POST)
public String login(User user,Model model) throws Exception {
    user=userservice.checkLogin(user.getUsername(),user.getPassword());
    if(user!=null){
        model.addAttribute(user);
        return "welcome";// 路径 WEB-INF/pages/welcome.jsp            
    }
    return "fail";
}
}
