package com.ssi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eno;
	private String name;
	private String desg;
	private int sal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}
	public Employee(int eno, String name, String desg, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	
}
