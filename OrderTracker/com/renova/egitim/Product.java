package com.renova.egitim;

import java.io.Serializable;

public abstract class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String description;
	private int id;
	private static int nextProductId = 222;
	private String name;
	private double retailPrice;
	

	public Product() {
		setId(Product.nextProductId++);	
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the retailPrice
	 */
	public double getRetailPrice() {
		return retailPrice;
	}

	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

}
