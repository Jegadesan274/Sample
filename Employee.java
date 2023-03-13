package com.employee.details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="employeedetails")
public class Employee {
		
	@Id
	@Column(name="id")
	private Integer Id;
	@Column(name="name")
	private String Name;
	@Column(name="emailid")
	private String Emailid;
	@Column(name="age")
	private Integer Age;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
}


