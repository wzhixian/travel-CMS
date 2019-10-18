package com.wzx.ssm.service;

import com.wzx.ssm.domain.Product;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-18 21:08
 */
public interface IProductService {
    //查询全部产品
    List<Product> findAll() throws Exception;
    //保存产品
    void save(Product product) throws Exception;
}
