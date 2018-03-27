package com.domo.sdk.request;

public class RequestException extends RuntimeException {

    private ErrorResponse errorResponse;

    public RequestException(String msg) {
        super(msg);
    }

    public RequestException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public RequestException(int statusCode, String msg) {
        super(msg);
        errorResponse = new ErrorResponse();
        errorResponse.setStatus(statusCode);
    }

    public RequestException(int statusCode, String msg, Throwable throwable) {
        super(msg, throwable);
        errorResponse = new ErrorResponse();
        errorResponse.setStatus(statusCode);
    }


    public RequestException(ErrorResponse err) {
        super(err.toErrorString());
        this.errorResponse = err;
    }

    public int getStatusCode() {
        if(errorResponse != null) {
            return errorResponse.getStatus();
        } else {
            return -1;
        }
    }


}
