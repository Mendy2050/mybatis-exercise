package com.itheima.test;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mendy
 * @create 2023-04-09 18:52
 */
public class MyBatisTest {
    @Test
    public void testSelectAll() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {
        //接收参数
        int status = 1;
        String company_name = "华为";
        String brand_name = "华为";

        //处理参数
        company_name = "%" + company_name + "%";
        brand_name = "%" + brand_name + "%";

        //封装对象
        Map map = new HashMap();
        map.put("status" , status);
        map.put("company_name", company_name);
//        map.put("brand_name" , brand_name);



        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        List<Brand> brands = brandMapper.selectByCondition(map);
        System.out.println(brands);

        //5. 释放资源
        sqlSession.close();
    }


    @Test
    public void testSelectByConditionSingle() throws IOException {
        //接收参数
        int status = 1;
        String company_name = "华为";
        String brand_name = "华为";

        //处理参数
        company_name = "%" + company_name + "%";
        brand_name = "%" + brand_name + "%";

        //封装对象
        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompany_name(company_name);
//        brand.setBrand_name(brand_name);



        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        //接收参数
        int status = 1;
        String company_name = "波导手机";
        String brand_name = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;



        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompany_name(company_name);
        brand.setBrand_name(brand_name);
        brand.setDescription(description);
        brand.setOrdered(ordered);



        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        brandMapper.add(brand);

        //
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd2() throws IOException {
        //接收参数
        int status = 1;
        String company_name = "波导手机";
        String brand_name = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;



        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompany_name(company_name);
        brand.setBrand_name(brand_name);
        brand.setDescription(description);
        brand.setOrdered(ordered);



        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        brandMapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);

        //
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        //接收参数
        int status = 0;
        String company_name = "波导手机";
        String brand_name = "波导";
        String description = "波导手机,手机中的战斗机";
        int ordered = 200;
        int id = 6;



        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompany_name(company_name);
//        brand.setBrand_name(brand_name);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);



        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        int count = brandMapper.update(brand);
        System.out.println(count);

        //
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();
    }


    @Test
    public void testDeleteById() throws IOException {
        //接收参数
        int id = 6;

        //封装对象


        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        brandMapper.deleteById(id);

        //
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();
    }


    @Test
    public void testDeleteByIds() throws IOException {
        //接收参数
        int[] ids = {3,5,7};

        //封装对象


        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法
        brandMapper.deleteByIds(ids);

        //
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();
    }


}
