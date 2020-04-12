package com.test.mybatis.pojo;

import com.test.mybatis.entity.User;

import java.util.List;

/**
 * VO---KV键值对
 */
public class UserInfoVo {
    User user;
    List<Integer> ids;


    public UserInfoVo() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
