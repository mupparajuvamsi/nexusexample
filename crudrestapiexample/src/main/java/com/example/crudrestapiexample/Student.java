package com.example.crudrestapiexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private String studentid;
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + "]";
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Column(name = "studentname")
	private String studentname;
}
