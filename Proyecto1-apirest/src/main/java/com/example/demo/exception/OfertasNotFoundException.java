
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class OfertasNotFoundException extends RuntimeException {
    public OfertasNotFoundException(Long id) {
        super("No se encontró la oferta con el ID: " + id);
    }
}