package com.SuperApp.version01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SuperApp.version01.dao.OffersDao;
import com.SuperApp.version01.entities.Offers;
import com.SuperApp.version01.entities.Response;

@Service
public class OfferServiceImpl implements OfferService {
	
	//private Response response;
	
	@Autowired
	private OffersDao offersDao;

	public OfferServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response getOffers() {
		// TODO Auto-generated method stub
		List<Offers> list = offersDao.getOffers();
		Response response = new Response(1, 0, "I", "Success", list);
		return response;
		//response = new Response(status, errorCode, messageType, message, list);
	}

}
