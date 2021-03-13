package com.zby.server01.controller;

import com.zby.server01.pojo.User;
import com.zby.server01.service.impl.TokenService;
import com.zby.server01.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/login")
    public Object login(@RequestParam(value = "uid") int uid, @RequestParam(value = "password") String password)
    {
        Boolean result = userService.isUser(uid,password);
        if (result)
        {
            User user = userService.getUserByUid(uid);
            System.out.println("login success!");
            String token ="";
            token =  tokenService.sign(user.getUsername(),uid);
            return token;
        }
        else {
            System.out.println("login failed!");
        }
        return result;
    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "Register Part",notes = "需要判断用户的nickname和两次密码是否输入正确，nickname不能重复，email格式要正确，插入数据库的时候返回uid")
    @RequestMapping(value = "/register")
    public Object register(String nickname,String password,String re_password,String info,String email)
    {

        String re_email = "www." + email;
        Boolean isGoodNickName = userService.isUserNameRepeat(nickname);
        Boolean isEmail = userService.isEmail(re_email);
        Boolean isPasswordSame = userService.isPasswordSame(password,re_password);


        if (!isGoodNickName)
        {
            System.out.println("nickname is not correct!");
            return 1;
        }

        if (!isEmail)
        {
            System.out.println("is not email!");
            return 2;
        }
        if (!isPasswordSame)
        {
            System.out.println("password is not same!");
            return 3;
        }

        User result = userService.insertUser(nickname,password,re_email,info,"1");
        System.out.println("insertUser");
        if (result!=null)
        {
            System.out.println(result.getUid());
            long uid =result.getUid();
            User user = userService.getUserByUid(uid);
            System.out.println("login success!");
            String token ="";
            token =  tokenService.sign(user.getUsername(),uid);

            return token;
        }

        return 5;
    }

}
