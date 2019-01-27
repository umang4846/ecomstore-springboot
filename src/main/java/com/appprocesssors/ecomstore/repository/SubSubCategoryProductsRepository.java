package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import com.appprocesssors.ecomstore.model.SubSubCategoryProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubSubCategoryProductsRepository extends MongoRepository<SubSubCategoryProducts,String> {

    List<SubSubCategoryProducts>  findAllByMenuid(String menuid);

}
