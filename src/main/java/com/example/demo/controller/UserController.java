package com.example.demo.controller;

import java.security.Principal;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;
import com.example.demo.entity.User;
import com.example.demo.service.IProduitService;
import com.example.demo.service.IUserService;



@RestController
@RequestMapping("/api/user")
@CrossOrigin

public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@RequestMapping("/login")
    public boolean login(@RequestBody User user) {
		System.out.println("--------------------");
        return  user.getEmail().equals("fahmi") && user.getMdp().equals("123");
    }
     
    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
          .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
          .decode(authToken)).split(":")[0];
    }
	
	
	
	
	
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/getByEmail/{email}/{mdp}")
	public User getUser(@PathVariable String email,@PathVariable String mdp){
		System.out.println("@GetMapping(\"/{email,mdp}\")");
		
		return userService.getUser(email,mdp);
	}
	
	@GetMapping("/getById/{id}")
	public Optional<User> getUser(@PathVariable Long id){
		System.out.println("xxxxx");
		return userService.getUser(id);
	}
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit produit) {
		
	}
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		
	}


}
