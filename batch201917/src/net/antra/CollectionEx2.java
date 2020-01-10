package net.antra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEx2 {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new SortingEx());
		ts.add(56);
		ts.add(18);
		ts.add(98);
		ts.add(5);
		ts.add(76);
		ts.add(109);
		ts.add(12);
		ts.add(89);
		
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//System.out.println(ts);
		//HashSet hs=new HashSet();
		//LinkedHashSet hs=new LinkedHashSet();
		/*TreeSet hs=new TreeSet();
		hs.add(10);
		hs.add(8);
		hs.add(new Student());
		hs.add(98.32f);
		hs.add("manas");
		hs.add(45);
		hs.add(true);
		hs.add(10);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}*/
		
		//System.out.println(hs);
		
		/*for(int i=0;i<hs.size();i++) {
			
			System.out.println(hs.get(i));
		}*/
	}
}
