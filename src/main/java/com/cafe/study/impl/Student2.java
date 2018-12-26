package com.cafe.study.impl;

public class Student2 implements Person{
	private String name;
    public Student2(String name) {
        this.name = name;
    }
    
    
    public void giveMoney() {
        try {
          //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       System.out.println(name + "上交班费50元");
    }


	public void talk() {
		// TODO Auto-generated method stub
		
	}
}
