package com.jhjcompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//MyCalculator myCalculator = new MyCalculator();
		//myCalculator.setA(10);
		//myCalculator.setB(5);
		
		//Calculator calculator = new Calculator();
		//Calculator calculator2 = new Calculator();
		//Calculator calculator3 = new Calculator();
		
		//myCalculator.setCalculator(calculator2); 
		// 멤버 변수(멤버 객체)인 calculator 외부에서 객체를 생성하여 초기화 -> DI
		//myCalculator.addition();
		
		
		//MyCalculator myCalculator2 = new MyCalculator(calculator3);
		//myCalculator2.division();
		
		String configLocation = "classpath:applicationCTX.xml";
		// 스프링 컨테이너 applicationCTX.xml(설정파일)파일 가져옴
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// ctx 라는 컨테이너 생성
		
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		// 스프링 컨테이너에서 객체 가져오기 -> DI
		
		myCalculator.addition();

		// ======================================================================================
		System.out.println("==============================================");
		
		//StudentInfo studentInfo1 = new StudentInfo();
		//StudentDto studentDto1 = new StudentDto();
		//studentDto1.setName("홍길동");
		//studentDto1.setAge(17);
		//studentDto1.setGradeNum("4");
		//studentDto1.setClassNum("5");
		
		//StudentInfo studentInfo2 = new StudentInfo();
		//StudentDto studentDto2 = new StudentDto();
		//studentDto2.setName("이순신");
		//studentDto2.setAge(20);
		//studentDto2.setGradeNum("3");
		//studentDto2.setClassNum("7");
		
		
		//studentInfo1.setStudentDto(studentDto1);
		//studentInfo1.printStudentInfo();
		//studentInfo2.setStudentDto(studentDto2);
		//studentInfo2.printStudentInfo();
		
		
		StudentInfo studentInfo1 = ctx.getBean("studentInfo1", StudentInfo.class);
		studentInfo1.printStudentInfo();
		
		StudentInfo studentInfo2 = ctx.getBean("studentInfo2", StudentInfo.class);
		studentInfo2.printStudentInfo();
	}

}
