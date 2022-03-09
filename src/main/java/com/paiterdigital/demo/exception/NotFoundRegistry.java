package com.paiterdigital.demo.exception;

import java.util.function.Supplier;

public class NotFoundRegistry extends RuntimeException {

    public NotFoundRegistry(String message) {
        super(message);
    }

}
