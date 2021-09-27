package com.suzanalima.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.suzanalima.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
