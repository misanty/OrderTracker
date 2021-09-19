package com.renova.egitim;

public class Software extends Product{
	private String license;



	/**
	 * @param license
	 */
	public Software(String license) {
		super();
		this.license = license;
	}



	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}



	@Override
	public String getDescription() {
		return "Software [license=" + license + ", getId()=" + getId() + ", getName()=" + getName()
		+ ", getRetailPrice()=" + getRetailPrice() + "]";
	}



	

}
