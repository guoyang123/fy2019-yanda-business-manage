package com.neuedu.controller;

import com.neuedu.consts.Const;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    IUserService userService;



    @RequestMapping(value = "login",method = RequestMethod.GET)
    public  String login(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public  String login(UserInfo userInfo, HttpSession session){

       UserInfo loginUserInfo= userService.login(userInfo);

        System.out.println(loginUserInfo);

        if(loginUserInfo!=null){
            session.setAttribute(Const.CURRENT_USER,loginUserInfo);

            return "redirect:home";
        }
        return "login";
    }


    @RequestMapping("home")
    public  String  home(){

        return "home";
    }





}
