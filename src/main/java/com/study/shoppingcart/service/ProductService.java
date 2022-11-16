package com.study.shoppingcart.service;

import com.study.shoppingcart.domain.Product;
import com.study.shoppingcart.repository.MemoryProductRepository;
import com.study.shoppingcart.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * 상품 목록 조회
     */
    public List<Product> productList(){
        return productRepository.findAll();
    }
}
