package com.fran.AppTwo.Service.Implementation;

import com.fran.AppTwo.Model.Product;
import com.fran.AppTwo.Repository.ProductRepository;
import com.fran.AppTwo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplementationService implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductImplementationService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();

    }
}
