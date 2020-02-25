package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface IUserService {

	User getUser(String email,String mdp);
	List<User> getUsers();
	void addUser(User user);
	Optional<User> getUser(Long id);
	


}
