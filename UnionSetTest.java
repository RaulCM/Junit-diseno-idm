package union;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class UnionSetTest {

	Set<Integer> a = new HashSet<>();
	Set<Integer> b = new HashSet<>();
	
	@Before public void setUp(){
		a.add(1);
		a.add(2);
		b.add(3);
	}
	@Test(expected=NullPointerException.class)
	public void TestNullSet() {
		Union.unionSet(null,null);
	}
	@Test
	public void TestRepeatedElement(){
		a.add(1);
		Set<Integer> c = new HashSet<>();
		c.add(1);
		c.add(2);
		c.add(3);
		assertTrue(c.equals(Union.unionSet(a, b)));
	}
	@Test
	public void TestNullElement(){
		a.add(null);
		Set<Integer> c = new HashSet<>();
		c.add(1);
		c.add(null);
		assertTrue(c.equals(Union.unionSet(a, b)));
	}
}
