package com.tech1.trans;

public class Texi extends Trans{
	private int xDan;
public Texi(int cusCnt, int dis,int xDan) {
		super(cusCnt, dis);
		this.xDan=xDan;
	}

	@Override
	public int getCharge() {		
		return cusCnt*dis*xDan;
	}
}
