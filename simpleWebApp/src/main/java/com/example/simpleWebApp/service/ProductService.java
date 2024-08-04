package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Canon Camera", 70000), new Product(103, "Shure mic", 40000)));
    public List<Product> getProducts(){
//       return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100, "No item", 0));

        return repo.findById(prodId).orElse(new Product(0, "null", 0));

    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prod.getProdId()){
//                index = i;
//            }
//        }
//
//        products.set(index, prod);

        repo.save(prod);

    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prodId){
//                index = i;
//            }
//        }
//        products.remove(index);

        repo.deleteById(prodId);
    }
}
