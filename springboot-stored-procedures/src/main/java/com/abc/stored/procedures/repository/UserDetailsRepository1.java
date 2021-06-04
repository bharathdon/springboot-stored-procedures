package com.abc.stored.procedures.repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

//for inout parameter we use persistencecontext


@Repository
public class UserDetailsRepository1 {

	@PersistenceContext
	private EntityManager entityManager;

	public String findUserFullNameInOutUsingName(String dob) {

		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("get_user_full_name_inout");
		query.registerStoredProcedureParameter("in_out", String.class, ParameterMode.INOUT);
		query.setParameter("in_out", dob);

		return query.getOutputParameterValue("in_out").toString();

	}

}
