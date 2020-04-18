package charitybox.jsp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserClassTest 
{
	@Test
	void testGetOrgName() 
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgName(list);
		assertEquals(list, user.getOrgName());
	}

	@Test
	void testSetOrgName() 
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgName(list);
		assertEquals(list, user.getOrgName());
	}

	@Test
	void testGetOrgUsername()
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgUsername(list);
		assertEquals(list, user.getOrgUsername());
	}

	@Test
	void testSetOrgUsername()
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgUsername(list);
		assertEquals(list, user.getOrgUsername());
	}

	@Test
	void testGetOrgPassword()
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgPassword(list);
		assertEquals(list, user.getOrgPassword());
	}

	@Test
	void testSetOrgPassword()
	{
		UserClass user = new UserClass();
		List<String> list = new ArrayList<String>();
		user.setOrgPassword(list);
		assertEquals(list, user.getOrgPassword());
	}

}
