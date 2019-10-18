package com.wzx.ssm.service;

import com.wzx.ssm.domain.Permission;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-26 11:18
 */
public interface IPermissionService {
    List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
