package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/17 8:46
 * @Author: 袁硕
 * @Description:
 */
@FeignClient("house-provider")
public interface HouseServiceFeign {

    @GetMapping("selectHousePage")
    Map<String, Object> selectHousePage(@RequestParam("page")Integer page, @RequestParam("rows") Integer rows);

    @DeleteMapping("deleteHouseById")
    void deleteHouseById(@RequestParam("id")Integer id);

    @DeleteMapping("delAllHouse")
    void delAllHouse(@RequestParam("ss") String ss);
}
