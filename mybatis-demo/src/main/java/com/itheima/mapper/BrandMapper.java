package com.itheima.mapper;


import com.itheima.pojo.Brand;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Mendy
 * @create 2023-04-09 15:56
 */
public interface BrandMapper {

    List<Brand> selectAll();

    @Select("select * from mybatis.tb_user where id = #{id}")
    Brand selectById(int id);

//    List<Brand> selectByCondition(@Param("status") int status,
//                                  @Param("company_name") String company_name,
//                                  @Param("brand_name") String brand_name);
//    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleteByIds(int[] ids);

}
