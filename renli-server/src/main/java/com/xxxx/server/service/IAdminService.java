package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Admin;
import com.xxxx.server.pojo.RespBean;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhouyunsheng
 * @since 2022-02-28
 */
@Mapper
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param * @param username
     * @param password
     * @param request
     * @return com.xxxx.server.pojo.RespBean
     */


    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param * @param username
     * @return com.xxxx.server.pojo.Admin
     */


    Admin getAdminByUserName(String username);
}
