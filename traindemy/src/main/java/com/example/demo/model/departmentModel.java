package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Department")
public class departmentModel {
	@Id
	private String _id;
	private String departmentName;
	
	public departmentModel(String _id, String departmentName) {
		super();
		this._id = _id;
		this.departmentName = departmentName;
	}
	
	public departmentModel() {
		super();
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}

