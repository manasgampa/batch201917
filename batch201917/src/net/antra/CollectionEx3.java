package net.antra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionEx3 {

	public static void main(String[] args) {
		
		ConcurrentHashMap hm=new ConcurrentHashMap();
		//hm.put
		
		//HashMap hm=new HashMap();
		
		
		//Integer it=new Integer(k);
		//System.out.println(it.hashCode());
		//HashMap hm2=new HashMap();
		//LinkedHashMap hm=new LinkedHashMap();
		hm.put(1, "manas");
		hm.put(98, "Rishi");
		hm.put(new Student(), "Yucong Chen");
		hm.put(1,"Ziming");
		hm.put(new Student(), "Bob");
		hm.put("abc", "Zhouxing Di");
		hm.put(99, "Rishi");
		
		Set set=hm.keySet();
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			hm.put(989, "abc");
		}
		
	}
}
