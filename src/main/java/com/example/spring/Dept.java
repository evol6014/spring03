package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor	// 아규가 있는 생성자 만들어줌
@NoArgsConstructor	// 디폴트생성자 만들어줌
public class Dept {
	int deptno;
	String dname;
	String loc;

}
