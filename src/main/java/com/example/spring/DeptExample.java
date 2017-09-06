package com.example.spring;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept dept = new Dept();	//	생성
		dept.setDeptno(10);		//	초기화
		dept.setDname("개발부");
		dept.setLoc("서울");
		
		System.out.println(dept);
		System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " + dept.getLoc());
		
		
	}
}
