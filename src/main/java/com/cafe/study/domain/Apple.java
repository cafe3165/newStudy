package com.cafe.study.domain;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Apple {
	private int price;
	public int Name ;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Apple apple = new Apple();
//        apple.setPrice(5);
//        System.out.println("Apple Price:" + apple.getPrice());
//        
//        String pak="com.cafe.study.domain.";
		
//        Class clz = Class.forName(pak+"Apple");
//        Method setPriceMethod = clz.getMethod("setPrice", int.class);
//        Constructor appleConstructor = clz.getConstructor();
//        Object appleObj = appleConstructor.newInstance();
//        setPriceMethod.invoke(appleObj, 14);
//        Method getPriceMethod = clz.getMethod("getPrice");
//        System.out.println("Apple Price:" + getPriceMethod.invoke(appleObj));
        
//        Class clz = Apple.class;
//        Apple apple = (Apple)clz.newInstance();
//		Class clz = Apple.class;
//		Constructor constructor = clz.getConstructor(String.class, int.class);
//		Apple apple = (Apple)constructor.newInstance("红富士", 15);
//      Method getPriceMethod = clz.getMethod("getPrice");
//
//		System.out.println(getPriceMethod.invoke(apple));
		
		Class clz = Apple.class;
		Field[] fields = clz.getDeclaredFields();
		for (Field field : fields) {
		    System.out.println(field.getName());
		}
        
		
	}

}
