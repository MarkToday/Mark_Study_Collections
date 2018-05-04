package com.csp.rdbc.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.csp.rdbc.entity.RbacUser;
import com.csp.rdbc.service.UserSercice;  
  
@Controller
@RequestMapping(value = "/user") 
public class RbacUserController {

    @Autowired
    private UserSercice userService;
    
    @RequestMapping(value="/showname",method=RequestMethod.GET)
    public String showUserName(@RequestParam("uid") String uid,HttpServletRequest request,Model model){
        System.out.println("showname");
        RbacUser user = userService.getUserById(uid);
        if(user != null){
            request.setAttribute("name", user.getUserName());
            model.addAttribute("mame", user.getUserName());
            return "showName";
        }
        request.setAttribute("error", "没有找到该用户！");
        return "error";
    }
    
    @RequestMapping(value = "/list")  
    public ModelAndView list() {  
        ModelAndView mv=new ModelAndView();  
        List<RbacUser>  userList=userService.getUser();  
        mv.addObject("userList",userList);  
        mv.setViewName("/showUserList");  
        return mv;  
    } 
}