package com.fran.AppTwo.Repository;

import com.fran.AppTwo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product,Integer> {

    @Query(value = "SELECT * FROM product;",nativeQuery = true)
    List<Product> selectAllProduct ();
}
