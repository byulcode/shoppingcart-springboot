package com.study.shoppingcart;

import com.study.shoppingcart.repository.MemoryProductRepository;
import com.study.shoppingcart.repository.ProductRepository;
import com.study.shoppingcart.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public ProductService productService(){
        return new ProductService(productRepository());
    }

    @Bean
    public ProductRepository productRepository(){
        return new MemoryProductRepository();
    }
}
