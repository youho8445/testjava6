package com.tech1.trans;

public abstract class Trans {
	protected int cusCnt; //�ο�
	protected int dis;  //�̵��Ÿ�
	
	
	public Trans(int cusCnt, int dis) {
		this.cusCnt=cusCnt;
		this.dis=dis;
	}
	public abstract int getCharge();
	
	@Override
	public String toString() {
		return cusCnt+":"+dis;
	}
	
	
}
