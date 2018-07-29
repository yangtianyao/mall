package com.chuhe.mall.dto;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private int status;
    private String message;
    private T data;

    public ResponseResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(0, "成功", data);
    }

    public static ResponseResult fail() {
        return new ResponseResult(-1, "失败", null);
    }

}
