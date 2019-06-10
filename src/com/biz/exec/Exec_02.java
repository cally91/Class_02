package com.biz.exec;

import com.biz.moda.ScoreVO;
import com.biz.moda.StudantVO;

public class Exec_02 {

	public static void main(String[] args) {

		StudantVO stVO =new StudantVO();
		ScoreVO scVO = new ScoreVO();
		
		stVO.Number="1";
		scVO.setKor(120);
		int intKor=scVO.getKor();
		
		scVO.setKor(-50);
		intKor= scVO.getKor();
		
		System.out.println("국어점수 : "+ intKor);
		}

}
