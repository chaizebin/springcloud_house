package com.jk.service;

import com.jk.model.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> queryUserList();

    void insUserList(UserBean userBean);

    void deleteGood(Integer userid);

    UserBean queryUserById(Integer userid);
}
