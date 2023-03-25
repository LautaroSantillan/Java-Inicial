package com.deg.productservice.controller;

import com.deg.productservice.exception.ProductAlreadyExistsException;
import com.deg.productservice.model.ProductModel;
import com.deg.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/")
    public ResponseEntity<ProductModel> create(@RequestBody ProductModel product) throws ProductAlreadyExistsException {
        return new ResponseEntity<>(this.productService.create(product), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProductModel> update(@RequestBody ProductModel product, @PathVariable Long id) throws Exception {
        return new ResponseEntity<>(this.productService.update(product,id), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductModel> findById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(this.productService.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<ProductModel>> findAll(){
        return new ResponseEntity<>(this.productService.findAll(), HttpStatus.OK);
    }
}
