package com.cg.demosecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.demosecurity.dto.MyUserDetails;
import com.cg.demosecurity.dto.User;
import com.cg.demosecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUserName(userName);
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found: " + userName));
		
		return user.map(MyUserDetails::new).get();
	}
	
}
