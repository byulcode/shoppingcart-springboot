package com.study.shoppingcart;

import com.study.shoppingcart.repository.JpaProductRepository;
import com.study.shoppingcart.repository.MemoryProductRepository;
import com.study.shoppingcart.repository.ProductRepository;
import com.study.shoppingcart.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public ProductService productService() {
        return new ProductService(productRepository());
    }

    @Bean
    public ProductRepository productRepository() {
        return new JpaProductRepository(em);
    }
}
