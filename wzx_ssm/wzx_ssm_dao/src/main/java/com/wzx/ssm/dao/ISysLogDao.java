package com.wzx.ssm.dao;

import com.wzx.ssm.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-27 14:54
 */
public interface ISysLogDao {
    @SelectKey(keyProperty = "id",resultType = String.class,before = true,statement = "select replace(uuid(),'-','')")
    @Insert("insert into sysLog values(#{id,jdbcType=VARCHAR},#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog) throws Exception;

    @Select("select * from sysLog")
    List<SysLog> findAll() throws Exception;
}
