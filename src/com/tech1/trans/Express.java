package com.tech1.trans;

public class Express extends Trans implements Start ,End {
	private int eDan;
	public Express(int cusCnt, int dis,int eDan) {
		super(cusCnt, dis);
		this.eDan=eDan;
	}


	
	@Override
	public int getCharge() {		
		return cusCnt*dis*eDan;
	}



	@Override
	public String getStartStation() {
		// TODO Auto-generated method stub
		return "서울";
	}



	@Override
	public String gerEndStation() {
		// TODO Auto-generated method stub
		return "부산";
	}
}
