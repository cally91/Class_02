package com.biz.moda;

/*
 * VO: 
 * 사용자 정의 변수라고 하며
 * 맴버변수에 값들을 담아서 다른 매서드에 보내거나
 * 메서드에서 리턴하는 값을 받는 용도로 사용한다
 * 
 * extends Object
 * -- 개발자가 어떤클래스를 선언하면
 * -- 코드를 직접 작성하지 않아도
 * -- 자동으로 생성되는 보이지 않는 코드
 * -- 자바에 기본적으로 들어있는 Object라는 클래스의
 * -- 메서드 들을 사용할수 있도록 해주는 구문
 */
public class ScoreVO extends Object {

	// private: 아무나 함부로 맴버변수에
	// 접근 (저장 읽기 모두)하지마라
	private String numder;

	private int Kor;
	private int eng;
	private int math;

	private int total;
	private int avg;
	
	
	
	
	public String getNumder() {
		return numder;
	}

	public void setNumder(String numder) {
		this.numder = numder;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public void setKor (int Kor) {
		if(Kor > 100 ||  Kor < 0) {
			System.out.printf("국어점수(%d)는 0점이상 100점 이하만 가능!!\n",Kor);
		}else {
		
		this.Kor =Kor;
		}
	}
	
	public int getKor() {
		return this.Kor;
		
	}
	public String toString() {
		return "학번 ; "+ this.numder
				+"국어 : "  + this.Kor
				+"영어 : "+ this.eng
				+"수학 : "+ this.math;
	}
}
