package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-Cloud
 * @Date: 2019/4/10 23:02
 * @Author: 任豪杰
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("touserPage")
    public String togoodPage(){
        return "userPage";
    }

    @RequestMapping("AddUser")
    public String toAddUser(){
        return "addUser";
    }


}
