package com.kiran.test.mt;

public class StudentVo {
	
	String studentId;
	String studentName;
	String stundentClass;
	String studentRank;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStundentClass() {
		return stundentClass;
	}
	public void setStundentClass(String stundentClass) {
		this.stundentClass = stundentClass;
	}
	public String getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(String studentRank) {
		this.studentRank = studentRank;
	}
	public StudentVo(String studentId, String studentName, String stundentClass, String studentRank) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stundentClass = stundentClass;
		this.studentRank = studentRank;
	}
	@Override
	public String toString() {
		return "StudentVo [studentId=" + studentId + ", studentName=" + studentName + ", stundentClass=" + stundentClass
				+ ", studentRank=" + studentRank + "]";
	}
	
	

}
