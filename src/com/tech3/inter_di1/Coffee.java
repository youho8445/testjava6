package com.tech3.inter_di1;

public class Coffee {
	private HotAmericano ame; //null�� �ʱ�ȭ
//	private IceAmericano ame;
	public Coffee() {  //����Ʈ������ (�⺻ ������)
//		System.out.println("���� ȣ������");
		ame=new HotAmericano();
//		ame=new IceAmericano();
//		System.out.println(ame);
	
	}
	public void coffeeType() {
		System.out.println(ame.getName());
	}
}
