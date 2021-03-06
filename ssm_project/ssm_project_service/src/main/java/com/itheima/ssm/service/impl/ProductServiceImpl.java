package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ProdcutMapper;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProdcutMapper prodcutMapper;

    @Transactional
    public List<Product> findAll() {

        List<Product> productList = prodcutMapper.findAll();

        return productList;
    }
}
