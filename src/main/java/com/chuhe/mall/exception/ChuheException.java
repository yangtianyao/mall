package com.chuhe.mall.exception;

public class ChuheException extends RuntimeException {
    public ChuheException(String message) {
        super(message);
    }

    public ChuheException(String message, Throwable cause) {
        super(message, cause);
    }
}
