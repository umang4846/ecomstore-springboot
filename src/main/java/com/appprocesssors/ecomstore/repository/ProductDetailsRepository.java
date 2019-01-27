package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.ProductDetails;
import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductDetailsRepository extends MongoRepository<ProductDetails,String> {

    Page<ProductDetails> findAllByMenuid(String menuid, Pageable pageable);
    ProductDetails findFirstByProductCode(String menuid);

}
