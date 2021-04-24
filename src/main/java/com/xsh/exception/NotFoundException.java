package com.xsh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: wangxiaobo
 * @create: 2021-02-28 03:04
 **/
//HTTP状态码
@ResponseStatus(HttpStatus.NOT_FOUND)      //自定义NotFoundException异常,会跳转到404页面
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super ();
    }

    public NotFoundException(String message) {
        super (message);
    }

    public NotFoundException(String message, Throwable cause) {
        super (message, cause);
    }
}
