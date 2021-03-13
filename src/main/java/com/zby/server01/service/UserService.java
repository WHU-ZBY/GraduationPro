package com.zby.server01.service;

import com.zby.server01.dao.UserMapper;
import com.zby.server01.pojo.Project;
import com.zby.server01.pojo.User;
import com.zby.server01.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public interface UserService {
    Boolean isUser(long uid, String password);
    User getUserByUid(long uid);
    Boolean isEmail(String email);
    Boolean isPasswordSame(String password,String re_Password);
    User insertUser(String nickname, String password, String email, String info, String avatar);
    Boolean isUserNameRepeat(String username);
    int modifyPassword(long uid,String password,String rePassword);
    int modifyUserInfo(User user);
    List<Project> getProjects(long uid);

}
