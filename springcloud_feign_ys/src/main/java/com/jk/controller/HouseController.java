package com.jk.controller;

import com.jk.service.HouseServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:42
 * @Author: 袁硕
 * @Description:
 */
@Controller
@RequestMapping("houseFeign")
public class HouseController {

    @Autowired
    private HouseServiceFeign houseServiceFeign;

    @GetMapping("selectHousePage")
    @ResponseBody
    public Map<String,Object> selectHousePage(Integer page , Integer rows){
        System.out.println(page+"--"+rows);
        return houseServiceFeign.selectHousePage(page,rows);
    }

    @DeleteMapping("deleteHouseById")
    @ResponseBody
    public void deleteHouseById(Integer id){
        System.out.println(id);
        houseServiceFeign.deleteHouseById(id);
    }
    @DeleteMapping("delAllHouse")
    @ResponseBody
    public void delAllHouse(String ss){
        System.out.println(ss+"...................");
        houseServiceFeign.delAllHouse(ss);
    }
}
