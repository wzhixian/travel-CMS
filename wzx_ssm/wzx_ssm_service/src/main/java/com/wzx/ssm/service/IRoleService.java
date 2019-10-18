package com.wzx.ssm.service;

import com.wzx.ssm.domain.Permission;
import com.wzx.ssm.domain.Role;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-25 23:25
 */
public interface IRoleService {
    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermission(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
