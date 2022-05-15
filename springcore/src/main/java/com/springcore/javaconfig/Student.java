package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosa;


public class Student {

	private Samosa samosa;

    public Samosa getSamosa() {
		return samosa;
	}

    public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}



	public Student() {
		super();
		this.samosa = samosa;
	}

	

	public void Study() {
		 

		System.out.println("student is reading book");
	}
}
