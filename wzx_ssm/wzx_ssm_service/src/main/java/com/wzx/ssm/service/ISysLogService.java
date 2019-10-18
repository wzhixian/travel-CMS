package com.wzx.ssm.service;

import com.wzx.ssm.domain.SysLog;

import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-27 14:52
 */
public interface ISysLogService {
    void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
