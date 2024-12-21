package com.practice.Hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int eid;
	@Column(name="Name")
	private String ename;
	@ManyToMany(mappedBy="project")
	private List<Project> project;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", project=" + project + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Employee(int eid, String ename, List<Project> project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}