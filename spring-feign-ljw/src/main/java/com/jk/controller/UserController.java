package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("queryUserList")
    @ResponseBody
    public List<UserBean> queryGoodsList() {
        List<UserBean> list = userService.queryUserList();
        return list;
    }

    @PostMapping("insUserList")
    @ResponseBody
    public void insGoodsList(UserBean userBean){
        userService.insUserList(userBean);
    }

    @DeleteMapping("deleteUser")
    @ResponseBody
    public void deleteUser(Integer userid){
        userService.deleteUser(userid);
    }

    //回显
    @GetMapping("queryUserById")
    @ResponseBody
    public UserBean queryUserById(Integer userid){
        return userService.queryUserById(userid);
    }

}
