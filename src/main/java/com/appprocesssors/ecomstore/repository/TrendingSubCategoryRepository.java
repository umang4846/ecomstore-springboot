package com.appprocesssors.ecomstore.repository;


import com.appprocesssors.ecomstore.model.ProductList;
import com.appprocesssors.ecomstore.model.TrendingHome;
import com.appprocesssors.ecomstore.model.TrendingSubCategory;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrendingSubCategoryRepository extends MongoRepository<TrendingSubCategory,String> {

    List<TrendingSubCategory> findAllByMenuid(String menuid);


}
