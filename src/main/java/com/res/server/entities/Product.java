package com.res.server.entities;


import lombok.Builder;
import lombok.Data ;

@Data
@Builder
public class Product {

    private String productId ;

    private String name ;

    private String description ;

    private double prize ;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }


    public Product(String productId, String name, String description, double prize) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.prize = prize;
    }

    public Product() {
        super();
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public static class ProductBuilder{
        private String productId ;
        private String name ;
        private String description ;
        private double prize ;

        public ProductBuilder setProductId(final String productId) {
            this.productId = productId;
            return this ;
        }

        public ProductBuilder setName(final String name) {
            this.name = name;
            return this ;
        }

        public ProductBuilder setDescription(final String description) {
            this.description = description;
            return this ;
        }

        public ProductBuilder setPrize(final double prize) {
            this.prize = prize;
            return this ;
        }


        public Product build(){
            return new Product(productId,name,description,prize);
        }
    }








}
