package com.renova.egitim;

public class Manual extends Product{
	private String publisher;

	/**
	 * @param publisher
	 */
	public Manual(String publisher) {
		super();
		this.publisher = publisher;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Manual [publisher=" + publisher + ", getId()=" + getId() + ", getName()=" + getName()
		+ ", getRetailPrice()=" + getRetailPrice() + "]";
	}
/*
	@Override
	public void setRetailPrice(double retailPrice) {
		// TODO Auto-generated method stub
		super.setRetailPrice(retailPrice);
	}
*/
	
	
	

}
