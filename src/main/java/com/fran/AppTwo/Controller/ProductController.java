package com.fran.AppTwo.Controller;

import com.fran.AppTwo.Model.Product;
import com.fran.AppTwo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping ("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping ("/getall")
    public List<Product> selectAllProduct (){
        return productService.selectAllProduct();


    }


}

