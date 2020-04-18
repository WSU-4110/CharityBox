package charitybox.jsp;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class UserClassTest {
	private UserClass fN;
	List<String> aN = new ArrayList<String>();
	
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