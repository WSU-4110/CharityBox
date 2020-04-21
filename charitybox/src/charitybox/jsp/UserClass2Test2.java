package charitybox.jsp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import charitybox.jsp.UserClass;

class UserClass2Test2 {

	private UserClass fN;
	List<String> aN = new ArrayList<String>();
	
	@Test
	void testGetDate() {
		fN = new UserClass();
		fN.setDate(aN);
		assertEquals(aN, fN.getDate());
	}

	@Test
	void testSetDate() {
		fN = new UserClass();
		fN.setDate(aN);
		assertEquals(aN, fN.getDate());
	}

	@Test
	void testGetOrgAddress() {
		fN = new UserClass();
		fN.setOrgAddress(aN);
		assertEquals(aN, fN.getOrgAddress());
	}

	@Test
	void testSetOrgAddress() {
		fN = new UserClass();
		fN.setOrgAddress(aN);
		assertEquals(aN, fN.getOrgAddress());
	}

	@Test
	void testGetOrgPhone() {
		fN = new UserClass();
		fN.setOrgPhone(aN);
		assertEquals(aN, fN.getOrgPhone());
	}

	@Test
	void testSetOrgPhone() {
		fN = new UserClass();
		fN.setOrgPhone(aN);
		assertEquals(aN, fN.getOrgPhone());
	}

}