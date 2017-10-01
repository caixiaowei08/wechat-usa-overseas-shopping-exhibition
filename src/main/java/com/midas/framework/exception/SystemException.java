package com.midas.framework.exception;

/**
 * Created by User on 2017/9/12.
 */
public class SystemException extends Exception {

    public SystemException(String message) {
        super(message);
    }

    public String toString() {
        return "SystemException[" + getMessage() + "]";
    }

}
