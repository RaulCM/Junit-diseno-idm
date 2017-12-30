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
}