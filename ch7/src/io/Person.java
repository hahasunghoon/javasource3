package io;

import java.io.Serializable;

// Serializable : 직렬화(객체 파일에쓰기)
public class Person implements Serializable {
	private String name;
	private String job;
	
	
	Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}
