package com.res.server.services;


import com.res.server.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private List<Product> list=new ArrayList<>();

    public ProductService(){
        list.add(
                Product.builder().setProductId(UUID.randomUUID().toString())
                                  .setName("Demo Product")
                                   .setDescription("This is Sample Product")
                        .setPrize(25678.556).build()   )     ;
    }

    public Product add(Product product){

        product.setProductId(UUID.randomUUID().toString()) ;

        list.add(product);

        return product ;
    }



    public List<Product> getAll(){
        return list ;
    }

    public void delete(String id){
        list.removeIf(product -> product.getProductId().equals(id));
    }







}
