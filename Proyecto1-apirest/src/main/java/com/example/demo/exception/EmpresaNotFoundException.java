
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmpresaNotFoundException extends RuntimeException {
	/**
		 *
		 */
	private static final long serialVersionUID = 1L;

	public EmpresaNotFoundException() {
		super("L’empresa no existeix");
	}
}