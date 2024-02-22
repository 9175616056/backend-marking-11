package com.marketing.services;

import java.util.List;

import com.marketing.entities.banglow;

public interface servi {

	public void onesave(banglow house);

	public List<banglow> listte();

	public void deletee(long id);
	
	public banglow updatee(long id);

}
