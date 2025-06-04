package org.example.exceptions;

public class DeliveryException extends RuntimeException {
    private String message;
    public  DeliveryException (String message){
        this.message = message;
    }
}
