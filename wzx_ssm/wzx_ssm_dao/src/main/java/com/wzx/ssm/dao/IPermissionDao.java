package com.wzx.ssm.dao;

import com.wzx.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-25 22:25
 */
public interface IPermissionDao {
    @Select("select * from permission where id in (select permissionId from role_permission where roleId = #{id})")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @SelectKey(keyProperty = "id",resultType = String.class,before = true,statement = "select replace(uuid(),'-','')")
    @Insert("insert into permission values(#{id,jdbcType=VARCHAR},#{permissionName},#{url})")
    void save(Permission permission) throws Exception;
}
