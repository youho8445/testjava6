package com.tech3.inter_di2;

public class Coffee {
	
	private Americano americano;
	public Coffee(Americano ame) {  //디폴트생성자 (기본 생성자)
		americano=ame;
	}
	public void coffeeType() {
		System.out.println(americano.getName());
	}
}
