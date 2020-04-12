package com.test.mybatis.test;

import com.test.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.List;

public class Test01 {

    @Test
    public void Test() throws  Exception{
        InputStream inputStream = null;
        String resource = "SqlMapConfig.xml";
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        User user = sqlSession.selectOne("getUserById",1);
        List<User> users = sqlSession.selectList("getUserByLikeName","张");
        System.out.println(users);
        sqlSession.close();


    }

}
