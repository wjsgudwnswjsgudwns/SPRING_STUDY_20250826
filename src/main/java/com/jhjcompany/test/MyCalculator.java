package com.jhjcompany.test;

public class MyCalculator {

	// 필드
	int a; // 첫번째 인수
	int b; // 두번째 인수
	
	//Calculator calculator = new Calculator();  // 객체를 멤버 변수로 생성 -> calculator 객체에게 의존하는 관계 성립
	Calculator calculator;
	
	
	public void addition() {
		calculator.add(this.a, this.b);
	}
	
	public void subtraction() {
		calculator.sub(this.a, this.b);
	}
	
	public void multiplication() {
		calculator.mult(this.a, this.b);
	}
	
	public void division() {
		calculator.divi(this.a, this.b);
	}
	
	// calculator 객체 setter 선언
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	// 생성자
	public MyCalculator() {
	}
	
	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public MyCalculator(int a, int b, Calculator calculator) {
		super();
		this.a = a;
		this.b = b;
		this.calculator = calculator;
	}
	
	
	
	
}
