package com.practice.Hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Project {

	@Id
	private int pid;
	@Column(name="Name")
	private String pname;
	@ManyToMany(mappedBy="emp")
	private List<Employee> emp;
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emp=" + emp + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	public Project(int pid, String pname, List<Employee> emp) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
}