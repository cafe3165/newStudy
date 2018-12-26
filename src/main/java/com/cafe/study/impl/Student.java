package com.cafe.study.impl;

public class Student implements Person {

	private String name;
    public Student(String name) {
        this.name = name;
    }
    
    public void giveMoney() {
       System.out.println(name + "上交班费50元");
    }

	public void talk() {
		// TODO Auto-generated method stub
		
	}	
}
