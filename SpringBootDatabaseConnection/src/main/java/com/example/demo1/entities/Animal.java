package com.example.demo1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long wing;
	private String name;
	private String color;
	
	public Animal() {
		super();
	}
	public Animal(String name,Long wing,String color) {
		this.name=name;
		this.wing=wing;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getWing() {
		return wing;
	}
	public void setWing(Long wing) {
		this.wing = wing;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", wing=" + wing + ", color=" + color + "]";
	}
	
	
	
}
