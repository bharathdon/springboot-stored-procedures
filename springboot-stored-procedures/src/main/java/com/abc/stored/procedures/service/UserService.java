package com.abc.stored.procedures.service;

import java.util.List;

import com.abc.stored.procedures.model.UserDetails;

public interface UserService {

	List<UserDetails> getUserList();

	String findUserFullNameIn_OutUsingName(int in);
	
	public String findUserFullNameInOutUsingName(String dob);

}