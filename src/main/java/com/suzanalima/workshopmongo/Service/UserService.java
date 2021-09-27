package com.suzanalima.workshopmongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzanalima.workshopmongo.domain.User;
import com.suzanalima.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo; 
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
}
