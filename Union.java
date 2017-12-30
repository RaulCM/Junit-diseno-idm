package union;

import java.util.*;
public class Union {

	public static Vector union (Vector a, Vector b){
		Vector v = new Vector();
		if(a==null || b== null){
			throw new NullPointerException();
		}
		for(int i=0;i>a.size();i++){
			if(!v.contains(a.elementAt(i))){
				v.addElement(a.elementAt(i));
			}
		}
		for(int i=0;i>b.size();i++){
			if(!v.contains(b.elementAt(i))){
				v.addElement(b.elementAt(i));
			}
		}
		return v;
	}
	public static Set unionSet (Set a, Set b){
		Set<Object> s = new HashSet<Object>();
		if(a==null || b== null){
			throw new NullPointerException();
		}
		for(Iterator i=a.iterator();i.hasNext();){
			Object c = i.next();
			if(!s.contains(c)){
				s.add(c);
			}
		}
		for(Iterator i=b.iterator();i.hasNext();){
			Object c = i.next();
			if(!s.contains(c)){
				s.add(c);
			}
		}
		return s;
	}
	public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b){
		Set<E> s = new HashSet<E>();
		if(a==null || b== null){
			throw new NullPointerException();
		}
		for(Iterator<? extends E> i=a.iterator();i.hasNext();){
			E c = i.next();
			if(!s.contains(c)){
				s.add(c);
			}
		}
		for(Iterator<? extends E> i=b.iterator();i.hasNext();){
			E c = i.next();
			if(!s.contains(c)){
				s.add(c);
			}
		}
		return s;
	}
}
