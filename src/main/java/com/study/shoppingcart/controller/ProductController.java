package com.study.shoppingcart.controller;

import com.study.shoppingcart.domain.Product;
import com.study.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/list")
    public String productList(Model model){
        List<Product> products = productService.productList();
        model.addAttribute("products", products);
        return "productList";
    }

}
