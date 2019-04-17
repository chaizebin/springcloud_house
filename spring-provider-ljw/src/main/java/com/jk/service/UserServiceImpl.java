package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public void insUserList(UserBean userBean) {
        if(userBean.getUserid() == null){
            userMapper.insUserList(userBean);
        }else{
            userMapper.updateUserList(userBean);
        }

    }

    @Override
    public void deleteGood(Integer userid) {
        userMapper.deleteGood(userid);
    }

    @Override
    public UserBean queryUserById(Integer userid) {
        return userMapper.queryUserById(userid);
    }
}
