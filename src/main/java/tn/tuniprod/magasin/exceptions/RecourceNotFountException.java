package tn.tuniprod.magasin.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Ressource not found")
public class RecourceNotFountException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public RecourceNotFountException()  {
        super();
    }
    public RecourceNotFountException(String message) {
        super(message);
    }

    public RecourceNotFountException(String message, Throwable cause) {
        super(message, cause);
    }
}
