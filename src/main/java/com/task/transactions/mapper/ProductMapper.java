package com.task.transactions.mapper;
import com.task.transactions.dto.ProductDto;
import com.task.transactions.entity.Product;
public class ProductMapper {

    public static ProductDto maptoProductDto(Product product){
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQnt()
                );
    }
    public static Product maptoProductDto(ProductDto productDto){
        return new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getPrice(),
                productDto.getQnt()
        );
    }

}
