package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Mendy
 * @create 2023-04-09 14:41
 */
public class MyBatisDemo2 {
    public static void main(String[] args) throws IOException {
        //1、
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2、
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3、
//        List<User> Users = sqlSession.selectList("test.selectAll");
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = usermapper.selectAll();

        System.out.println(users);

        //4、
        sqlSession.close();


    }


}


