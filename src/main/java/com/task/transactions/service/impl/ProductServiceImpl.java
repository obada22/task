package com.task.transactions.service.impl;
import com.task.transactions.dto.ProductDto;
import com.task.transactions.entity.Product;
import com.task.transactions.mapper.ProductMapper;
import com.task.transactions.repository.ProductRepo;
import com.task.transactions.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.task.transactions.exceptions.NotFoundException;
import com.task.transactions.service.ProductService;

import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;
    //create product service
    @Override
    public ProductDto createProduct(ProductDto productDto)
    {
        Product product= ProductMapper.maptoProductDto(productDto);
        Product saveProduct=productRepo.save(product);
        return ProductMapper.maptoProductDto(saveProduct);
    }

    //Get product By Id service
    @Override
    public ProductDto getProductById(Long productId){
        Product product = productRepo.findById(productId)
                .orElseThrow(()
                        -> new NotFoundException("resource Not Found"));
        return ProductMapper.maptoProductDto(product);
    }

    //Get all products service
    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products=productRepo.findAll();
        return products.stream().map(
                        (product) -> ProductMapper.maptoProductDto(product))
                .collect(Collectors.toList());

    }

    //Update product service
    @Override
    public ProductDto updateProduct(Long productId, ProductDto updateProduct) {


        Product product = productRepo.findById(productId).orElseThrow(
                ()-> new NotFoundException("not found:"+ productId));

        product.setName(updateProduct.getName());
        product.setPrice(updateProduct.getPrice());
        product.setQnt(updateProduct.getQnt());
        Product updateProductDto = productRepo.save(product);
        return ProductMapper.maptoProductDto(updateProductDto);

    }
    //Delete product service
    @Override
    public void deleteProduct(Long productId) {
        Product product = productRepo.findById(productId).orElseThrow(
                ()-> new NotFoundException("not found:"+ productId));
        productRepo.deleteById(productId);
    }

}
