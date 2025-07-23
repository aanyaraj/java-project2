package com.springBoot.Service;

import org.springframework.stereotype.Service;

import com.springBoot.Entity.User;
@Service
public interface UserSevice {
	
User addUser(User user);
User Update(User user);
void Delete(int userId);
}
