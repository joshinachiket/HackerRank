import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCases {
	
	Runner runHelper;
	
	@Before
	public void init () {
		runHelper = new Runner();
	}

	@Test
	public void test1() {
		
		// test case with correct same day sysdate
		// birthday = 12th Oct 1991 4:10:22
		// sysDate = 12th Oct 1997 4:12:22
		
		Birthday birthday = new Birthday("1997-10-12T04:10:22Z");
		Birthday sysDate = new Birthday("1991-10-12T04:12:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		
		// test case with correct same day sysdate
		// birthday = 12th Oct 1991 4:10:22
		// sysDate = 12th Oct 1997 4:12:22
		
		Birthday birthday = new Birthday("1991-10-12T04:10:22Z");
		Birthday sysDate = new Birthday("1997-10-12T04:12:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		
		// birthday = 12th Oct 1991 4:10:22
		// sysDate = 12th Oct 1997 4:10:21
		
		Birthday birthday = new Birthday("1991-10-12T04:10:22Z");
		Birthday sysDate = new Birthday("1997-10-13T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		
		// birthday = 12th Oct 1991 4:10:22
		// sysDate = 12th Oct 1997 4:10:22
		
		Birthday birthday = new Birthday("1991-10-12T04:10:22Z");
		Birthday sysDate = new Birthday("1997-10-12T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		
		// birthday = 12th Oct 1991 4:10:22
		// sysDate = 12th Oct 1997 4:10:23
		
		Birthday birthday = new Birthday("1991-12-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-12-31T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test6() {
		
		// birthday = 31st Dec 1991 4:10:22
		// sysDate = 31st Dec 1997 4:10:23
		
		Birthday birthday = new Birthday("1991-12-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-12-31T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test7() {
		
		// birthday = 31st Dec 1991 4:10:22
		// sysDate = 1st Jan 1997 4:10:23
		
		Birthday birthday = new Birthday("1991-12-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-01-01T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test8() {
		
		// birthday = 31st Dec 1991 4:10:22
		// sysDate = 31st Dec 1997 4:10:21
		
		Birthday birthday = new Birthday("1991-12-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-01-01T04:12:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test9() {
		
		// birthday = 31st Mar 1991 4:10:22
		// sysDate = 31st Mar 1997 4:10:21
		
		Birthday birthday = new Birthday("1991-03-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-03-31T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test10() {
		
		// birthday = 1991-03-31T04:10:22Z
		// sysDate = 1997-03-31T04:10:23Z
		
		Birthday birthday = new Birthday("1991-03-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-03-31T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test11() {
		
		// birthday = 1991-03-31T04:10:22Z
		// sysDate = 1997-04-01T04:10:21Z
		
		Birthday birthday = new Birthday("1991-03-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-04-01T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test12() {
		
		// birthday = 1991-03-31T04:10:22Z
		// sysDate = 1997-04-01T04:10:23Z
		
		Birthday birthday = new Birthday("1991-03-31T04:10:22Z");
		Birthday sysDate = new Birthday("1997-04-01T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test13() {
		
		// birthday = 1991-04-30T04:10:22Z
		// sysDate = 1997-04-30T04:10:21Z
		
		Birthday birthday = new Birthday("1991-04-30T04:10:22Z");
		Birthday sysDate = new Birthday("1997-04-30T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test14() {
		
		// birthday = 1991-04-30T04:10:22Z
		// sysDate = 1997-04-30T04:10:23Z
		
		Birthday birthday = new Birthday("1991-04-30T04:10:22Z");
		Birthday sysDate = new Birthday("1997-04-30T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test15() {
		
		// birthday = 1991-04-30T04:10:22Z
		// sysDate = 1997-05-01T04:10:21Z
		
		Birthday birthday = new Birthday("1991-04-30T04:10:22Z");
		Birthday sysDate = new Birthday("1997-05-01T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test16() {
		
		// birthday = 1991-04-30T04:10:22
		// sysDate = 1997-05-01T04:10:23Z
		
		Birthday birthday = new Birthday("1991-04-30T04:10:22Z");
		Birthday sysDate = new Birthday("1997-05-01T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	// leap year test cases
	@Test
	public void test17() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-02-28T04:10:21Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("1997-02-28T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test18() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-02-28T04:10:23Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("1997-02-28T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test19() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:21Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("1997-03-01T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test20() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:23Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("1997-03-01T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test21() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-02-28T04:10:21Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-02-28T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test22() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-02-28T04:10:23Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-02-28T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test23() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:21Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-03-01T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test24() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:23Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-03-01T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test25() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:21Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-02-29T04:10:21Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test26() {
		
		// birthday = 1991-02-28T04:10:22Z
		// sysDate = 1997-03-01T04:10:23Z
		
		Birthday birthday = new Birthday("1991-02-28T04:10:22Z");
		Birthday sysDate = new Birthday("2020-02-29T04:10:23Z");
		
		boolean actual = runHelper.knowMyBirthday(birthday, sysDate);
		boolean expected = false;
		assertEquals(expected, actual);
	}

}
