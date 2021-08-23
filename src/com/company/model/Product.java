package com.company.model;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Product {

    private String name;

    public Product(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
