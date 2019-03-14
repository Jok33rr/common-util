package com.smarthouse.commonutil.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
    public ResourceNotFound(final String message) {
        super(message);
    }
    public static String getNoResourceMessage(final String resourceName, final int id) {
        return String.format("Resource %s with id = %d not found", resourceName, id);
    }
}
