package com.hbsols.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.hbsols.dao.IContactDao;
import com.hbsols.service.ContactServiceImpl;

public class ContactServiceTest {

	@Test
	public void testGetNameById_01() {
		
		IContactDao daoProxy = EasyMock.createMock(IContactDao.class);
		
		EasyMock.expect(daoProxy.findNameById(101)).andReturn("Hareesh");
		EasyMock.expect(daoProxy.findNameById(102)).andReturn("Borugolla");
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service = new ContactServiceImpl();
		//IContactService service = new ContactServiceImpl();
			service.setDao(daoProxy);

		String name =service.getNameById(101);
		assertNotNull(name);
	}
}
