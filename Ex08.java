package com.ict.day16;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
			Set<Integer> lottoNum = new HashSet<Integer>();
			while(lottoNum.size() < 6) {
				int number = (int)(Math.random()*45) + 1; // 1-45까지
				lottoNum.add(number);
				
			}
			int bonus = (int)(Math.random()*45) + 1;
	
			System.out.print("Lotto Set " + i + ": ");
			System.out.print(lottoNum);
			System.out.println(" + Bonus: " + bonus);

		}
	}
}
