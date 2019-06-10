package com.biz.moda;

public class ScoreVO {

	// private: 아무나 함부로 맴버변수에
	// 접근 (저장 읽기 모두)하지마라
	private String numder;

	private int kor;
	private int eng;
	private int math;

	private int total;
	private int avg;

	public void setKor (int Kor) {
		this.kor =Kor;
	}
	
	public int gatKor() {
		return this.kor;
	}
}
