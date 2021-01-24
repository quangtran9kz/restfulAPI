package com.dxc.service;

import java.util.List;
import java.util.Optional;

import com.dxc.model.User;

public interface UserService {
	
	Optional<User> findById(Integer id);
	
	List<User> findAllUser();
	
	long count();

	void delete(Integer id);

	boolean exists(Integer primaryKey);
}
