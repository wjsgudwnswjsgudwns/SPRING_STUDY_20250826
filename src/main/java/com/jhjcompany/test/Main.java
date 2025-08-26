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

	}

}
