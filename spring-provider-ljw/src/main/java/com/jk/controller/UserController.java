package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //查询
    @GetMapping("queryUserList")
    @ResponseBody
    public List<UserBean> queryGoodsList(){
        List<UserBean> user = userService.queryUserList();
        return user;
    }
    //新增用户
    @PostMapping("insUserList")
    @ResponseBody
    public void insUserList(@RequestBody UserBean userBean){
        userService.insUserList(userBean);
    }

    ///删除
    @DeleteMapping("deleteUser/{userid}")
    @ResponseBody
    public void deleteGood(@PathVariable("userid") Integer userid){
        userService.deleteGood(userid);
    }

    //回显
    @GetMapping("queryUserById/{userid}")
    @ResponseBody
    public UserBean queryGoodById(@PathVariable("userid")Integer userid){
        return userService.queryUserById(userid);
    }
}
