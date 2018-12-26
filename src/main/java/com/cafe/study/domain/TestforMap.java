package com.cafe.study.domain;

import java.util.HashMap;

public class TestforMap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameString="cafe";
		int age=22;
		Person p=new Person(nameString,age);
//		p.age=age;
//		p.name=nameString;
		System.out.println(p.age);
		p.work();
		
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put(nameString, p);
//		System.out.println(map.get(nameString));
		Person m=(Person) map.get(nameString);
		m.work();
		System.out.println(m.age);
		

	}

	

}

