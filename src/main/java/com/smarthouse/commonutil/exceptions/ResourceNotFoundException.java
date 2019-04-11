package com.smarthouse.commonutil.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(final String message) {
        super(message);
    }
    public static String getNoResourceMessage(final long id) {
        return getNoResourceMessage("Resource", id);
    }

    public static String getNoResourceMessage(final String resourceName, final long id) {
        return String.format("%s with id %d doesn't exists", resourceName, id);
    }
}
