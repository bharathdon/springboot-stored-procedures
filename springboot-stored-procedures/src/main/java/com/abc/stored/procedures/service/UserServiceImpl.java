package com.abc.stored.procedures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.stored.procedures.model.UserDetails;
import com.abc.stored.procedures.repository.UserDetailsRepository;
import com.abc.stored.procedures.repository.UserDetailsRepository1;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Autowired
	private UserDetailsRepository1 userDetails;

	@Override
	public List<UserDetails> getUserList() {
		return userDetailsRepository.findUserDetailsList();
	}

	@Override
	public String findUserFullNameIn_OutUsingName(int in) {
		return userDetailsRepository.findUserFullNameIn_OutUsingName(in);
	}

	@Override
	public String findUserFullNameInOutUsingName(String dob) {
		return userDetails.findUserFullNameInOutUsingName(dob);
	}
}
