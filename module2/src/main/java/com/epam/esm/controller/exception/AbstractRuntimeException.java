package com.epam.esm.controller.exception;

public abstract class AbstractRuntimeException extends RuntimeException {
    protected int errorCode;

    protected AbstractRuntimeException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return errorCode;
    }
}
