package com.xxxx.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类名:公共返回对象
 *
 * @Author zhouyunsheng
 * @Date 2022/3/2 9:10
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object obj;

    /**
     * 成功返回结果
     * @param * @param message
     * @return com.xxxx.server.pojo.RespBean
     */
    public static RespBean success(String message){
        return new RespBean(200,message,null);
    }
    /**
     *成功返回结果
     * @param * @param message
     * @param obj
     * @return com.xxxx.server.pojo.RespBean
     */
    public static RespBean success(String message,Object obj){
        return new RespBean(200,message,obj);
    }
    /**
     * 失败返回结果
     * @param * @param message
     * @return com.xxxx.server.pojo.RespBean
     */
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    /**
     * 失败返回结果
     * @param * @param message
     * @param obj
     * @return com.xxxx.server.pojo.RespBean
     */
    public static RespBean error(String message,Object obj){
        return new RespBean(500,message,obj);
    }
}
