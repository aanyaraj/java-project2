package com.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	User deleteById(int userId);

	
}
