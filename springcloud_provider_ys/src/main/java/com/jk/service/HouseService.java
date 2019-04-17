package com.jk.service;

import java.util.Map;

/**
 * @program: springcloud_house
 * @Date: 2019/4/16 17:19
 * @Author: 袁硕
 * @Description:
 */
public interface HouseService {

    Map<String, Object> selectHousePage(Integer page, Integer rows);

    void deleteHouseById(Integer id);

    void delAllHouse(String ss);
}
