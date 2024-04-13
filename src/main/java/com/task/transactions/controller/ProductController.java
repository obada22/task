package com.task.transactions.controller;

import com.task.transactions.dto.ProductDto;
import com.task.transactions.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/Products")
public class ProductController {



    @Autowired
    private ProductService productService;

    //Rest API buiLd add a product
    @PostMapping
    public ResponseEntity <ProductDto> createProduct(@RequestBody ProductDto productDto){
        ProductDto savedProduct= productService.createProduct(productDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    //Rest API buiLd Get a product
    @GetMapping(path = "{id}")
    public ResponseEntity <ProductDto> getProductById(@PathVariable("id") Long productId) {
        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok(productDto);
    }
    //Rest API buiLd Get all Products
    @GetMapping
    public ResponseEntity<List<ProductDto>>getAllProducts(){
        List<ProductDto> products  = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    //Rest API buiLd update product
    @PutMapping("{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") Long productId,
                                                    @RequestBody ProductDto updateProduct){
        ProductDto productDto=productService.updateProduct(productId, updateProduct);
        return ResponseEntity.ok(productDto);
    }

    //Rest API buiLd delete product
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok("Product Deleted Successfully..");
    }




}
