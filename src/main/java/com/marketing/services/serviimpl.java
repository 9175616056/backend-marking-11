package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.banglow;
import com.marketing.repository.Repository;

@Service
public class serviimpl implements servi {

	@Autowired
	private Repository repoo;
	
	@Override
	public void onesave(banglow house) {
		repoo.save(house);
		
	}

	@Override
	public List<banglow> listte() {
     List<banglow> findAll = repoo.findAll();
     return findAll;
	}

	@Override
	public void deletee(long id) {
		repoo.deleteById(id);
		
	}

	@Override
	public banglow updatee(long id) {
       Optional<banglow> findById = repoo.findById(id);
       banglow banglow = findById.get();
		return banglow;
	}

	
}
