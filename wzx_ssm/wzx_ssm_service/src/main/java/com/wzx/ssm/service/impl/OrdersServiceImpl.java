package com.wzx.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.wzx.ssm.dao.IOrdersDao;
import com.wzx.ssm.domain.Orders;
import com.wzx.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-20 18:46
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum是页码值，参数pageSize代表的是每页显示条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
