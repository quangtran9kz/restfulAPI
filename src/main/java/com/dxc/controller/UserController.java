package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.User;
import com.dxc.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	 @Autowired
	 private UserService userService;
	 
	    @GetMapping("/all")	    
	    public ResponseEntity<List<User>> findAllProduct() {
	        List<User> products = userService.findAllUser();
	        if (products.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }
}
