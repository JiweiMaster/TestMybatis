package com.test.mybatis.mapper;

import com.test.mybatis.entity.User;
import com.test.mybatis.pojo.UserInfoVo;

import java.util.List;

public interface UserMapper {

    User getUserById(int id);

    void insertUserInfo(User user);

    List<User> getUserByIds(UserInfoVo userInfoVo);


}
