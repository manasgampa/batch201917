package net.antra1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
	
	
	public static void main(String[] args) {
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		BiFunction<Integer, Integer,Integer> bifi=(i,j)->{return i+j;};

		//list.parallelStream().forEach(p->System.out.println(p.getAge()));
		/*Predicate p1=p->{Person p2=(Person)p;
							if(p2.getAge()>20) {
								return true;
							}else{
								return false;
							}};*/
		
	/*List<Person> li=list.stream().filter(p->p.getAge()>20).map(p->{int age=p.getAge();
		p.setAge(age+5); return p;
		}).collect(Collectors.toList());
		
		li.stream().forEach(i->System.out.println(i.getAge()));*/
		
		
		/*Function<Integer,Float> i1=(Integer p)->{return 56.34f;};  
		Float f1=i1.apply(1);*/
		/*List al=new ArrayList();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Person p=(Person)it.next();
			if(p.getAge()>20) {
				al.add(p);
			}
		}*/
		
		
	}

}
