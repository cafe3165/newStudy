package com.cafe.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.cafe.study.impl.Person;
import com.cafe.study.impl.Student2;
import com.cafe.study.impl.Teacher;

public class ProxyTest {
	 public static void main(String[] args) {
	        
	        //创建一个实例对象，这个对象是被代理的对象
	        Person zhangsan = new Student2("张三");
	        Person teacher=new Teacher("小明");
	        
	        //创建一个与代理对象相关联的InvocationHandler
	        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);
	        InvocationHandler stuHandler1 = new StuInvocationHandler<Person>(teacher);

	        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
	        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
	        Person stuProxy1 = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler1);

	       //代理执行上交班费的方法
	        stuProxy.giveMoney();
	        stuProxy1.talk();
	    }
}
