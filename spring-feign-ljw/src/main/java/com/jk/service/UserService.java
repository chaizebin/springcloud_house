package com.jk.service;

import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("springcloud-server")
public interface UserService {

    @GetMapping("queryUserList")
    List<UserBean> queryUserList();

    @PostMapping("insUserList")
    void insUserList(UserBean userBean);

    @DeleteMapping("deleteUser/{userid}")
    void deleteUser(@PathVariable("userid") Integer userid);

    @GetMapping("queryUserById/{userid}")
    UserBean queryUserById(@PathVariable("userid")Integer userid);
}
