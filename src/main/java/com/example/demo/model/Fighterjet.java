package com.example.demo.model;

public class Fighterjet {

	
	String Name;
	String Country;
	Integer Speed;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Integer getSpeed() {
		return Speed;
	}
	public void setSpeed(Integer speed) {
		Speed = speed;
	}
	public Fighterjet(String name, String country, Integer speed) {
		super();
		Name = name;
		Country = country;
		Speed = speed;
	}
	public Fighterjet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fighterjet [Name=" + Name + ", Country=" + Country + ", Speed=" + Speed + "]";
	}
	
}
