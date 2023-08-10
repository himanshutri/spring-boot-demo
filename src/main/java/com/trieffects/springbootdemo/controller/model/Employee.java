package com.trieffects.springbootdemo.controller.model;

public class Employee {
	private String name;
	private Integer id;
	private String address;
	
	
	public Employee(String name, Integer id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
