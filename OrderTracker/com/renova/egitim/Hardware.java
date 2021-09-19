package com.renova.egitim;

public class Hardware extends Product implements Taxable {
	private int warrantyPeriod;

	/**
	 * @param warrantyPeriod
	 */
	public Hardware(int warrantyPeriod) {
		super();
		this.warrantyPeriod = warrantyPeriod;

	}

	@Override
	public double getTax(double amount) {
		
		return amount * TAX_RATE;
	}

	public int getWarrantyPeriod() {
		return this.warrantyPeriod;
	}
	

	
	
	@Override
	public String getDescription() {

		return "Hardware [warrantyPeriod=" + warrantyPeriod + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getRetailPrice()=" + getRetailPrice() + "]";
	}

}
