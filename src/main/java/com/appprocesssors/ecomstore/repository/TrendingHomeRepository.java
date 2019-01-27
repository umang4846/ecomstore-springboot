package com.appprocesssors.ecomstore.repository;


import com.appprocesssors.ecomstore.model.TrendingHome;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrendingHomeRepository extends MongoRepository<TrendingHome,String> {



}
