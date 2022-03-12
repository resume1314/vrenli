package com.xxxx.server.controller;

import com.xxxx.server.pojo.Admin;
import com.xxxx.server.pojo.AdminLoginParam;
import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * 类名:登录
 *
 * @Author zhouyunsheng
 * @Date 2022/3/2 9:26
 * @Version 1.0
 */

 @Api(tags = "LoginController")
 @RestController
public class LoginController {

     @Autowired
     private IAdminService adminService;

     @ApiOperation(value = "登录之后返回token")
     @PostMapping("/login")
     public RespBean login(AdminLoginParam adminLoginParam , HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
     }

     @ApiOperation(value = "获取当前登录用户信息")
     @PostMapping("/admin/info")
     public Admin getAdminInfo(Principal principal){
         if (null == principal){
             return null;
         }
         String username = principal.getName();
         Admin admin = adminService.getAdminByUserName(username);
         admin.setPassword(null);
         return admin;
     }

     @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
         return RespBean.success("注销成功!");
     }
}
