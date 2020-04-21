package charitybox.jsp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserClassTest {
	
	private UserClass u;
	List<String> l = new ArrayList<String>();
	private UserClass fN;
	List<String> aN = new ArrayList<String>();
	
	
	@Test
	void testGetPassword() {
		u  = new UserClass(); 
		u.setPassword(l);
		assertEquals(l, u.getPassword());
	}

	@Test
	void testSetPassword() {
		u  = new UserClass();
		u.setPassword(l);
		assertEquals(l, u.getPassword());	}

	@Test
	void testGetUsername() {
		u = new UserClass();
		u.setUsername(l);
		assertEquals(l, u.getUsername());
	}

	@Test
	void testSetUsername() {
		u = new UserClass();
		u.setUsername(l);
		assertEquals(l, u.getUsername());
	}

	@Test
	void testGetEmail() {
		u = new UserClass();
		u.setEmail(l);
		assertEquals(l,u.getEmail());
	}

	@Test
	void testSetEmail() {
		u = new UserClass();
		u.setEmail(l);
		assertEquals(l,u.getEmail());
	}
	
	
	@Test
	void testGetFirstName() {
		fN = new UserClass();
		fN.setFirstName(aN);
		assertEquals(aN, fN.getFirstName());
	}

	@Test
	void testSetFirstName() {
		fN = new UserClass();
		fN.setFirstName(aN);
		assertEquals(aN, fN.getFirstName());
	}

	@Test
	void testGetGender() {
		fN = new UserClass();
		fN.setgender(aN);
		assertEquals(aN, fN.getGender());
	}

	@Test
	void testSetgender() {
		fN = new UserClass();
		fN.setgender(aN);
		assertEquals(aN, fN.getGender());
	}

	@Test
	void testGetAge() {
		fN = new UserClass();
		fN.setAge(aN);
		assertEquals(aN, fN.getAge());
	}

	@Test
	void testSetAge() {
		fN = new UserClass();
		fN.setAge(aN);
		assertEquals(aN, fN.getAge());
	}


}
