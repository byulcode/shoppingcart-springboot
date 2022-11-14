package com.study.shoppingcart.repository;

import com.study.shoppingcart.domain.Product;

import java.util.*;

public class MemoryProductRepository implements ProductRepository {

    private static Map<Long, Product> store = new HashMap<>();
    private static long sequence = 0L; //0 1 2...이런 key값 만들어줌

    @Override

    public Product save(Product product) {
        product.setId(++sequence);
        store.put(product.getId(), product);
        return product;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Product> findByName(String name) {
        return store.values().stream()
                .filter(product -> product.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }
}
