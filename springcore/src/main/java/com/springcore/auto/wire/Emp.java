package com.springcore.auto.wire;

import java.net.Inet4Address;

import javax.management.monitor.MonitorSettingException;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
