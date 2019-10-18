package com.wzx.ssm.dao;

import com.wzx.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author wangzhixian
 * @date 2019-09-21 21:26
 */
public interface IMemberDao {
    @Select("select * from member where id = #{id}")
    public Member findById(String id) throws Exception;
}
