package com.sisgcobrancas.sisgcobrancas.exceptions;

import com.sisgcobrancas.sisgcobrancas.model.Client;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(String message) {
        super(message);
    }

    public ClientNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
