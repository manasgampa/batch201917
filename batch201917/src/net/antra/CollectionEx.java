package net.antra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		//ArrayList al=new ArrayList(10);//Object Array Data structure//
		//LinkedList al=new LinkedList();
		Vector al=new Vector();
		al.add(11);
		al.add(56.54f);
		al.add(new String("manas"));
		al.add(new Employee(45));
		al.add(11);
		//System.out.println(al.get(2));
		//System.out.println(al.size());
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//al.add(67);
		}
		List li=Collections.unmodifiableList(al);
		li.add(69);
		/*for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}*/
	}
	
}
