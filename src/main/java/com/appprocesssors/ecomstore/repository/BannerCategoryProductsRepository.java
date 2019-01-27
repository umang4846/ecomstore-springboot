package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.BannerCategoryProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BannerCategoryProductsRepository extends MongoRepository<BannerCategoryProducts,String> {



    List<BannerCategoryProducts>  findAllByMenuid(String menuid);

}
