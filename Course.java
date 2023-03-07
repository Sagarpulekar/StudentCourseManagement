package com.coursemanagement;

public class Course {
	private int cId;
	private String cName;
	private double cfee;

	public Course(int cId, String cName, double cfee) {
		this.cId = cId;
		this.cName = cName;
		this.cfee = cfee;
	}

	public int getCId() {
		return cId;
	}

	public void setCId(int cId) {
		this.cId = cId;
	}

	public String getCName() {
		return cName;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public double getCfee() {
		return cfee;
	}

	public void setCfee(double cfee) {
		this.cfee = cfee;
	}

	public String toString() {
		return "Course Id:-" + cId + "Course Name:-" + cName + "Course Fee:-" + cfee;
	}

}
