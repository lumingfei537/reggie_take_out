package com.itheima.reggie.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class Result<T> {//起名R也可以

    private Integer code;// 编码：1成功。0和其他数字失败

    private String msg;// 错误信息

    private T data;// 数据

    private Map map = new HashMap();// 动态数据

    //这里提供了几个静态方法来返回一个Result对象
    //之前是直接用构造器的set方法也可以实现同样的功能
    //不过此种方式的复用性更高
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(1);  //成功状态码
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
        result.setMsg(msg); //设置错误信息
        result.setCode(0);  //默认失败状态码，后期我们可以根据自己的需求来设置其他状态码
        return result;
    }

    public Result<T> add(String msg, String value) {
        this.map.put(msg, value);
        return this;
    }
}
