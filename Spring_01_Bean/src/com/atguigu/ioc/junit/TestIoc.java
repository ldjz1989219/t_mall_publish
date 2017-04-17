package com.atguigu.ioc.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.ioc.bean.Book;

public class TestIoc {
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("Bean.xml");
	//通过index属性赋值
	@Test
	public void TestBook03(){
		Book book = (Book) ioc.getBean("Book03");
		System.out.println(book);
	}
	@Test
	public void TestBook02(){
		Book book = (Book) ioc.getBean("Book02");
		System.out.println(book);
	}
	@Test
	public void testBook01() {
		/*//实验1：通过IOC容器创建对象，并为属性赋值★
		//1.创建IOC容器对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("Bean.xml");
		
		System.out.println("IOC容器对象创建好了");
		
		//2.从IOC容器中获取已经创建好的对象
		//默认情况下创建对象是在IOC容器创建和初始化过程中
		Book book = (Book) ioc.getBean("Book");
		System.out.println(book);*/
		/*//试验1通过创建IOC对象为属性赋值
		//1.创建IOC对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("ioc对象创建好了");
		//2.从IOC容器中获取已经创建好的对象，默认情况下是在IOC容器中创建和初始化过程中
		Book book = (Book) ioc.getBean("Book");
		System.out.println(book);*/
		//实验1通过创建ioc对象为属性赋值
		//1.创建ioc对象
		
		//2.从创建好的ioc对象中获取对象
		Book book = (Book) ioc.getBean("Book");
		System.out.println(book);
		System.out.println("hello java");
		System.out.println("你好我已修改");
	}

}
