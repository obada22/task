package com.task.transactions.service;
import java.util.List;
import com.task.transactions.dto.ProductDto;

import org.springframework.stereotype.Service;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    ProductDto getProductById(Long productId);

    List<ProductDto> getAllProducts();

    ProductDto updateProduct(Long productId, ProductDto updateProduct);

    void deleteProduct(Long productId);


}
