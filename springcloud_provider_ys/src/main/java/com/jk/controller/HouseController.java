package com.jk.controller;

import com.jk.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:17
 * @Author: 袁硕
 * @Description:
 */
@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;


    @GetMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(Integer page , Integer rows){
        System.out.println(page+"--"+rows);
        return houseService.selectHousePage(page,rows);
    }


    @DeleteMapping("deleteHouseById")
    @ResponseBody
    public void deleteHouseById( Integer id){
        System.out.println(id);
        houseService.deleteHouseById(id);
    }


    @DeleteMapping("delAllHouse")
    @ResponseBody
    public void delAllHouse(String ss){
        System.out.println(ss+"------------------");
        houseService.delAllHouse(ss);
    }



}
