package com.momo.exception;

/**
 * 数据库操作异常
 */
public class DbOperationException extends CustomException{
    public DbOperationException(String msg) {
        super(msg);
    }

    public DbOperationException() {
        super("数据库操作异常");
    }
}
