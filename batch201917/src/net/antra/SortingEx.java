package net.antra;

import java.util.Comparator;

public class SortingEx implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//returns positive if i1 comes after i2
		if(i1<i2) {
			return 1;
		}else if(i1>i2) {
		//returns negative if i1 comes before i2	
			return -1;
		}else {
			return 0;
			}
		
		
	}

}
