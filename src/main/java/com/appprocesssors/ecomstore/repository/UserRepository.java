package com.appprocesssors.ecomstore.repository;

import com.appprocesssors.ecomstore.model.Address;
import com.appprocesssors.ecomstore.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

    User findByPhone(String phone);
}
