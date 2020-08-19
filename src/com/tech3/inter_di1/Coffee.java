package com.tech3.inter_di1;

public class Coffee {
	private HotAmericano ame; //null로 초기화
//	private IceAmericano ame;
	public Coffee() {  //디폴트생성자 (기본 생성자)
//		System.out.println("나를 호출했음");
		ame=new HotAmericano();
//		ame=new IceAmericano();
//		System.out.println(ame);
	
	}
	public void coffeeType() {
		System.out.println(ame.getName());
	}
}
