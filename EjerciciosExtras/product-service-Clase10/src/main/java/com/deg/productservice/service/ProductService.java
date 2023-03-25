package com.deg.productservice.service;


import com.deg.productservice.exception.ProductAlreadyExistsException;
import com.deg.productservice.exception.ProductNotFoundException;
import com.deg.productservice.model.ProductModel;
import com.deg.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public ProductModel create(ProductModel newProduct) throws ProductAlreadyExistsException {
        Optional<ProductModel> productOp = this.productRepository.findByCodigo(newProduct.getCodigo());

        if (productOp.isPresent()){
            log.info("El producto que intenta agregar ya existe en la base de datos : " + newProduct);
            throw new ProductAlreadyExistsException("El producto que intenta agregar ya existe en la base de datos");
        }else {
            return this.productRepository.save(newProduct);
        }
    }

    public ProductModel update(ProductModel newProduct, Long id) throws Exception {
        log.info("ID INGRESANDO : " + id);
        if (id <= 0){
            throw new Exception("El id brindado no es valido");
        }

        Optional<ProductModel> productOp = this.productRepository.findById(id);

        if (productOp.isEmpty()){
            log.info("El producto que intenta modificar no existe en la base de datos : " + newProduct);
            throw new ProductNotFoundException("El producto que intenta modificar no existe en la base de datos");
        }else {
            log.info("el producto fue encontrado");
            ProductModel productBd = productOp.get();

            productBd.setCodigo(newProduct.getCodigo());
            productBd.setPrecio(newProduct.getPrecio());
            productBd.setDescripcion(newProduct.getDescripcion());

            log.info("producto actualizado : " + productBd);

            return this.productRepository.save(productBd);
        }
    }

    public ProductModel findById(Long id) throws Exception {
        if (id <= 0){
            throw new Exception("El id brindado no es valido.");
        }

        Optional<ProductModel> productOp = this.productRepository.findById(id);

        if (productOp.isEmpty()){
            log.info("El producto con el id brindado no existe en la base de datos : " + id);
            throw new ProductNotFoundException("El producto que intenta solicitar no existe");
        }else {
            return productOp.get();
        }
    }

    public List<ProductModel> findAll(){
        return this.productRepository.findAll();
    }
}
