package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long productID){
        Optional<Product> productOptional = productRepository.findById(productID);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "redirect:/purchaseSuccess";
            } else {
                return "redirect:/purchaseError";
            }
        } else  {
            return "redirect:/productNotFound";
        }
    }

    @GetMapping("/purchaseSuccess")
    public String displayPurchaseSuccess() {
        return "purchasesuccess";
    }

    @GetMapping("/purchaseError")
    public String displayPurchaseFailure() {
        return "purchaseerror";
    }

}
