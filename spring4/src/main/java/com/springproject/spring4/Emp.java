package com.springproject.spring4;

import java.util.*;

public class Emp {
List<String> tech;
Set<String> project;
Map<String,String> companies;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(List<String> tech, Set<String> project, Map<String, String> companies) {
	super();
	this.tech = tech;
	this.project = project;
	this.companies = companies;
}
public List<String> getTech() {
	return tech;
}
public void setTech(List<String> tech) {
	this.tech = tech;
}
public Set<String> getProject() {
	return project;
}
public void setProject(Set<String> project) {
	this.project = project;
}
public Map<String, String> getCompanies() {
	return companies;
}
public void setCompanies(Map<String, String> companies) {
	this.companies = companies;
}
@Override
public String toString() {
	return "Emp [tech=" + tech + ", project=" + project + ", companies=" + companies + "]";
}

}