package com.renova.egitim;

public class Individual extends Customer {
	private String licNumber;
	
	
	
	/**
	 * @param name
	 * @param phone
	 */
	public Individual(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the licNumber
	 */
	public String getLicNumber() {
		return licNumber;
	}

	/**
	 * @param licNumber the licNumber to set
	 */
	public void setLicNumber(String licNumber) {
		this.licNumber = licNumber;
	}

	@Override
	public String toString() {
		return String.format("Individual [getLicNumber()=%s, getAddress()=%s, getId()=%s, getName()=%s, getPhone()=%s]",
				getLicNumber(), getAddress(), getId(), getName(), getPhone());
	}


	
	

}
