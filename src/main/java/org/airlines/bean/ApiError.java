package org.airlines.bean;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;

/**
 * Created by pbaregal on 5/14/2019.
 */
public class ApiError {
    private HttpStatus status;
    private Object error;

    public ApiError(HttpStatus badRequest, Object error, Exception ex) {
        this.status=badRequest;
        this.error=error;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
