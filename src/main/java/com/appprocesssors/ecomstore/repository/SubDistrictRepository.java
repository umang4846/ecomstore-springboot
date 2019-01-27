package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import com.appprocesssors.ecomstore.model.SubDistrict;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubDistrictRepository extends MongoRepository<SubDistrict,String> {

}
