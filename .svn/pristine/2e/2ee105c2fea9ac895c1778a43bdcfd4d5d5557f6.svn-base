package com.example.dao;

import com.example.pojo.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,String> {

    public Users findByName(String name);
}
