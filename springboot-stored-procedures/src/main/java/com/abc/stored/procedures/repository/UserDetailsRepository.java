package com.abc.stored.procedures.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abc.stored.procedures.model.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	@Query(value = "call get_users()", nativeQuery = true)
	public List<UserDetails> findUserDetailsList();

	@Procedure(procedureName = "get_user_full_name_in_out", outputParameterName = "full_name")
	public String findUserFullNameIn_OutUsingName(@Param("user_id") Integer in);

}
