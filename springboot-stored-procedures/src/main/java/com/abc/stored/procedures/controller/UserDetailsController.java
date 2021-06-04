package com.abc.stored.procedures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abc.stored.procedures.model.UserDetails;
import com.abc.stored.procedures.service.UserService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ResponseEntity<List<UserDetails>> getuserDetails() {
		List<UserDetails> userList = userService.getUserList();
		return new ResponseEntity<List<UserDetails>>(userList, HttpStatus.OK);
	}

	@GetMapping("/a/{in}")
	public ResponseEntity<String> findUserFullNameIn_OutUsingName(@PathVariable Integer in) {
		String name = userService.findUserFullNameIn_OutUsingName(in);
		return new ResponseEntity<String>(name, HttpStatus.OK);
	}

	@GetMapping("/{dob}")
	public ResponseEntity<String> findUserFullNameInOutUsingName(@PathVariable String dob) {
		String fullNameInOutUsingName = userService.findUserFullNameInOutUsingName(dob);
		return new ResponseEntity<String>(fullNameInOutUsingName, HttpStatus.OK);

	}

}
