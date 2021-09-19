package com.renova.egitim;

public class Company extends Customer {

	private String contact;
	private int discount;

	/**
	 * @param name
	 * @param phone
	 * @param discount
	 */
	public Company(String name, String phone, int discount) {
		super(name, phone);
		this.discount = discount;
	}
	
	public Company(){
		
	}
	

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Company [contact=" + contact + ", discount=" + discount + ", getAddress()=" + getAddress()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getPhone()=" + getPhone() + "]";
	}
	
	

}
