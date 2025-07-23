package com.springBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Entity.User;
import com.springBoot.Service.UserSevice;

@RestController
public class UserController {
	
@Autowired 
private UserSevice userService;

@GetMapping("/userDetails")


@PostMapping("/add")
public User adduser(@RequestBody User user) {
	return userService.addUser(user);
	
}

@PutMapping("/update")
public User updateUser(@RequestBody User user) {
	return userService.Update(user);
}

@DeleteMapping("/delete/{userId}")
public void userDelete(@PathVariable int userId) {
	userService.Delete(userId);
}
}
