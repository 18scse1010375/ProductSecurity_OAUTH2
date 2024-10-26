package com.res.server.controllers;

import com.res.server.services.ProductService;
import org.springframework.web.bind.annotation.*;

import com.res.server.entities.Product ;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService ;

    public ProductController(ProductService productService){
        this.productService=productService ;
    }


    @PostMapping
    public Product createProduct(@RequestBody Product product  ){
      return  productService.add(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
       productService.delete(id);

    }








}
