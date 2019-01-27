package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.ProductDetails;
import com.appprocesssors.ecomstore.model.ProductList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductListRepository extends MongoRepository<ProductList,String> {

    Page<ProductList> findAllByMenuid(String menuid, Pageable pageable);

}
