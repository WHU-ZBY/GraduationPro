package com.zby.server01.service.impl;

import com.zby.server01.dao.ProjectMapper;
import com.zby.server01.dao.UserMapper;
import com.zby.server01.pojo.Project;
import com.zby.server01.pojo.ProjectExample;
import com.zby.server01.pojo.User;
import com.zby.server01.pojo.UserExample;
import com.zby.server01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProjectMapper projectMapper;

    public Boolean isUser(long uid, String password){
        User user = userMapper.selectByPrimaryKey(uid);

        if (user.getPassword().equals(password))
        {
            System.out.println("is True User!");
            System.out.println(user.getPassword());
            return true;
        }
        else
        {
            System.out.println("False Password or Uid!");
            return false;
        }
    }

    public User getUserByUid(long uid)
    {
        return userMapper.selectByPrimaryKey(uid);
    }

    public Boolean isUserNameRepeat(String username)
    {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()){
            return false;
        }else
            return true;
    }

    @Override
    public int modifyPassword(long uid, String password, String rePassword) {
        User user = getUserByUid(uid);
        System.out.println(user.toString());
        if (user.getPassword().equals(password)){
            UserExample userExample  =new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUidEqualTo(user.getUid());

            User user1 = new User();
            user1.setPassword(rePassword);
            return userMapper.updateByExampleSelective(user1,userExample);
        }else
            return 0;
    }

    @Override
    public int modifyUserInfo(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<Project> getProjects(long uid) {
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria =projectExample.createCriteria();
        criteria.andUidEqualTo(uid);
        System.out.println("uid"+uid);
        List<Project> list =projectMapper.selectByExample(projectExample);
        if (list.isEmpty()){
            return null;
        }
        return list;
    }

    public Boolean isEmail(String email)
    {
        String strPattern = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";
        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public Boolean isPasswordSame(String password,String re_Password)
    {
        if (password.equals(re_Password))
        {
            return true;
        }
        else
            return false;
    }

    public User insertUser(String nickname, String password, String email, String info, String avatar)
    {
        User user = new User();
        user.setUsername(nickname);
        user.setPassword(password);
        user.setEmail(email);
        user.setInfo(info);
        user.setIcon(avatar);
        user.setAuthority(0);
        userMapper.insert(user);
        return user;

    }

}
