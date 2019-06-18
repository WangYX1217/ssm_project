package com.itheima.ssm.dao;


import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ProdcutMapper {

    @Select("select * from product")
    List<Product> findAll();

}
