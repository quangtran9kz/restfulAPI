package com.dxc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dxc.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
