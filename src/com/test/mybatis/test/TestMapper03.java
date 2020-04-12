package com.test.mybatis.test;

import com.test.mybatis.entity.User;
import com.test.mybatis.mapper.UserMapper;
import com.test.mybatis.pojo.UserInfoVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestMapper03 {
    SqlSession sqlSession = null;

    @Before
    public void before() throws  Exception {
        InputStream inputStream = null;
        String resource = "SqlMapConfig.xml";
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void Test(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.getUserById(2);

        UserInfoVo userInfoVo = new UserInfoVo();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);ids.add(2);ids.add(3);
        userInfoVo.setIds(ids);

        List<User> users = userMapper.getUserByIds(userInfoVo);

        System.out.println(users);
    }
}
