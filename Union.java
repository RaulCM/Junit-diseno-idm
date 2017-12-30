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
}
