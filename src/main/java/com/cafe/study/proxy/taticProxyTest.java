package com.cafe.study.proxy;

import com.cafe.study.impl.Person;
import com.cafe.study.impl.Student;

public class taticProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person zhangsan = new Student("张三");
        
        //生成代理对象，并将张三传给代理对象
        Person monitor = new StudentsProxy(zhangsan);
        
        //班长代理上交班费
        monitor.giveMoney();
	}

}
