package com.deg.productservice.exception;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(String msg){
        super(msg);
    }
}
