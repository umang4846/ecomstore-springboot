package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubCategoryProductsRepository extends MongoRepository<SubCategoryProducts,String> {

    List<SubCategoryProducts>  findAllByMenuid(String menuid);

}
