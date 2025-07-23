package com.springBoot.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.Entity.User;
import com.springBoot.Repository.UserRepo;
import com.springBoot.Service.UserSevice;
@Service
public class UserServiceImpl implements UserSevice {
	
	private UserRepo userRepo;

	@Override
	public User addUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User Update(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void Delete(int userId) {
		
   userRepo.deleteById(userId);
	

}
}