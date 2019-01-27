package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Order,String> {


}
