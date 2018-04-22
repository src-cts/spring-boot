package com.howtodoinjava.example.yaml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5000204726475234055L;

	private String name;
	private int id;
	private List<Address> addresses = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addresses=" + addresses + "]";
	}

}
