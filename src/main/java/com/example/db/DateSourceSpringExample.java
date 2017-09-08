package com.example.db;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DateSourceSpringExample {

	public static void main(String[] args) throws SQLException {
		// DI Container, BeanFactory
		// LifeCycle
		// 1. 객체 생성
		// 2. 객체 초기화
		// 3. dependency injection 
		// 4. 객체 사용
		// 5. 객체 소멸
		GenericXmlApplicationContext ctx =		
				new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		// spring이 bean설정에 있는걸 다 new하고 set한다. (frame work)
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("after BeanFactory create");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
//		BasicDataSource ds = ctx.getBean(BasicDataSource.class);
//		
//		System.out.println(ds.getDriverClassName());
//		System.out.println(ds.getUrl());
//		System.out.println(ds.getUsername());
//		System.out.println(ds.getPassword());
//		
//		ds.getConnection();
		
		CityDao dao = ctx.getBean(CityDao.class);	// Bean 사용
		System.out.println(dao.selectAll());
		
		CountryDao dao2 = ctx.getBean(CountryDao.class);
		System.out.println(dao2.selectAll());
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("before BeanFactory ctx.close");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ctx.close();
	}
}
