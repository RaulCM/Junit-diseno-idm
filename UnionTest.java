package union;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class UnionTest {
	Vector a = new Vector();
	Vector b = new Vector();
	
	@Before public void setUp(){
		a.add(1);
		a.add(2);
		b.add(3);
	}
	
	@Test(expected=NullPointerException.class)
	public void TestNullVector() {
		Union.union(null,null);
	}
	@Test
	public void TestRepeatedElement(){
		a.add(3);
		a.add(4);
		a.add(3);
		b.add(3);
		b.add(6);
		b.add("3");
		Vector c = new Vector(6);
		c.add(3);
		c.add(4);
		c.add(6);
		c.add("3");
		assertTrue(c.equals(Union.union(a, b)));
	}
}