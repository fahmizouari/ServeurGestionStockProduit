package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUser(String email, String mdp) {
		System.out.println("servvv");
		return userRepository.findUser(email,mdp);
	}
	@Override
	public Optional<User> getUser(Long id) {

		return userRepository.findById(id);
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	

}
