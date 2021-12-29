package org.test;

public class Student {
	private void test1() {
		System.out.println("test1");

	}
	private void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.test1();
		s.test2();
	}

}
