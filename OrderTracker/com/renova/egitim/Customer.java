/**
 * 
 */
package com.renova.egitim;

import java.io.Serializable;
import java.util.List;

/**
 * @author misanty
 *
 */
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private int id ;
	private static int nextCustomerId = 0;
	private String name;
	private String phone;
	private String address;

	/**
	 * Overloaded version of the constructor
	 * Assigns the id first then move on to assign the instance variables.
	 * @param name  String Type name of the Customer
	 * @param phone String Type phone number of the Customer
	 */
	public Customer(String name, String phone) {
		this();
		this.name = name;
		this.phone = phone;
		
	}

	/**
	 * As soon as the Customer object is created this constructor is then initiated to assign the id,
	 * I see no reason to let the user assign the id, so I always find it more secure when id is assigned automatically.
	 */
	public Customer() {
		//This is a static class variable, it will increase and hold the value regardless of the instance of the object.
		Customer.nextCustomerId++;
		setId(Customer.nextCustomerId);
		
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		if (!address.isEmpty() && null != address) {
			this.address = address;
		}
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
	}

	/**
	 * @param phone the phone to set
	 */
	private void setPhone(String phone) {
		if (phone != null && !phone.isEmpty())
			this.phone = phone;
	}

	/***
	 * This method works as an automated setter,
	 * @param fieldName is the field name as in human readable context
	 * @param value is the value to assign the field to.
	 */
	public void changeFieldValue(String fieldName, String value) {
		switch (fieldName) {
		case "name":
			setName(value);
			break;
		case "phone number":
			setPhone(value);
			break;
		case "address":
			setAddress(value);
		break;
		default:
			break;
		}
	

	}
	

	


	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
