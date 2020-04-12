package com.test.mybatis.test;

import com.test.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test02 {
    SqlSession sqlSession = null;
    @Before
    public void before() throws Exception{
        InputStream inputStream = null;
        String resource = "SqlMapConfig.xml";
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
//        User user = sqlSession.selectOne("getUserById",1);
    }
    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public void Test(){
        User user = new User("李四",25);
        sqlSession.insert("insertUserInfo",user);
    }
}
