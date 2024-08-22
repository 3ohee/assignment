package com.ict.day16;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		// 로또 생성기 (5줄, 보너스번호까지)
		for (int i = 0; i < 5; i++) {
			Set<Integer> lottoNum = new HashSet<Integer>();
			while(lottoNum.size() < 6) {
				int number = (int)(Math.random()*45) + 1; // 1-45까지
				lottoNum.add(number);
				
			}
			// 보너스 번호 생성
			int bonus;
			
			// 로또 넘버에 있는지 없는지 검사
			do {
				bonus = (int)(Math.random()*45) + 1;
			} while (lottoNum.contains(bonus));
			
			System.out.print("Lotto Set " + (i+1) + ": ");
			System.out.print(lottoNum);
			System.out.println(" + Bonus: " + bonus);

		} 
	}
}
