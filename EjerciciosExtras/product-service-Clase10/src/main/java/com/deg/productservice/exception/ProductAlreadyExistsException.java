package com.deg.productservice.exception;

public class ProductAlreadyExistsException extends Exception{

    public ProductAlreadyExistsException(String msg){
        super(msg);
    }
}
