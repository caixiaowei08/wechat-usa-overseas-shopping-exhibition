package com.midas.framework.exception;

/**
 * Created by User on 2017/9/12.
 */
public class BusinessException extends Exception {

    public BusinessException(String message) {
        super(message);
    }


    public String toString() {
        return "BusinessException[" + getMessage() + "]";
    }
}
