package com.dxc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.repository.UserRepository;
import com.dxc.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public Optional<User> findById(Integer id) {
		return(UserRepository.findById(id));
	}

	@Override
	public List<User> findAllUser() {
		return (List<User>) UserRepository.findAll();
	}

	@Override
	public long count() {
		return UserRepository.count();
	}

	@Override
	public void delete(Integer id) {
		UserRepository.deleteById(id);
	}

	@Override
	public boolean exists(Integer id) {
		return UserRepository.existsById(id);
	}

}
