package com.immutableclass;

public final class  School {

	private final int regNo;
	private final String sName;
	private final Department dept;
//	public School() {
//		super();
//	}

	public School(int regNo, String sName, Department dept) {
		super();
		this.regNo = regNo;
		this.sName = sName;
		Department dep=new Department(dept.getSub());
		this.dept=dep;
	}
	
	public int getRegNo() {
		return regNo;
	}
	
	public String getsName() {
		return sName;
	}
	
	public Department getDept() {
		Department d = new Department(dept.getSub());
		return d;
	}
	
	@Override
	public String toString() {
		return "School [regNo=" + regNo + ", sName=" + sName + ", dept=" + dept + "]";
	}
	
	
}
