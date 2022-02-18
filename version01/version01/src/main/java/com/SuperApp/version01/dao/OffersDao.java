package com.SuperApp.version01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SuperApp.version01.entities.Offers;

@Repository
public class OffersDao {

	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Offers> getOffers(){
		
		StoredProcedureQuery query = em.createStoredProcedureQuery("GetOfferList", "Offers");
		query.execute();
		return query.getResultList();
	}

}
