package com.hbsols.service;

import com.hbsols.dao.IContactDao;

public class ContactServiceImpl implements IContactService {

	private IContactDao dao;

	public void setDao(IContactDao dao) {
		this.dao = dao;
	}

	public String getNameById(Integer id) {
		String name = dao.findNameById(id);
		return name.toUpperCase();
	}

}
