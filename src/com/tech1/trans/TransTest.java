package com.tech1.trans;

public class TransTest {
	public static void PrintCharge(Trans tran) {
		System.out.println("================");
		System.out.println(tran.toString());
		System.out.println("----------------");
		System.out.println("지불금액"+tran.getCharge());
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Trans[] trans=new Trans[4];
		trans[0]=new Train(5, 100, 200);
		trans[1]=new Express(10, 100, 100);
		trans[2]=new Texi(2, 10, 500);
		trans[3]=new Train(1, 100, 200);
		//for each문
//		for (Trans tran : trans) {
//			PrintCharge(tran);
//			
//		}
		//for문
		for (int i = 0; i < trans.length; i++) {
			PrintCharge(trans[i]);
			
		}
		Express ex=new Express(1, 10, 50);
		System.out.println(ex.getStartStation());
		System.out.println(ex.gerEndStation());
	}
	
}
