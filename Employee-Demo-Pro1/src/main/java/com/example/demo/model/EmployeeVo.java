package com.example.demo.model;

public class EmployeeVo {
	
	private String name;
	private Long age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeVo [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
