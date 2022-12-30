package com.example.demo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Class")
public class classModel {
	@Id
	private String _id;
	private String className;
	private String description;
	private String method;
	private Date startDate;
	private Date endDate;
	private List<classCourseModel> courses;
	
	public classModel(String className, String description, String method, Date startDate, Date endDate, List<classCourseModel> courses) {
		super();
		this.className = className;
		this.description = description;
		this.method = method;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courses = courses;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<classCourseModel> getCourses() {
		return courses;
	}
	public void setCourses(List<classCourseModel> courses) {
		this.courses = courses;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	
}
