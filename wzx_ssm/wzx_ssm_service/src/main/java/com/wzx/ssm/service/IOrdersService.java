package com.wzx.ssm.service;

import com.wzx.ssm.domain.Orders;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-20 18:45
 */
public interface IOrdersService {
    public List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
