package com.wzx.ssm.service.impl;

import com.wzx.ssm.dao.IProductDao;
import com.wzx.ssm.domain.Product;
import com.wzx.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-18 21:13
 */
@Transactional
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }

}
