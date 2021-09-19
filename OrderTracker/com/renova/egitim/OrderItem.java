package com.renova.egitim;

public class OrderItem {

	private static int lineNumber = 101;
	private int lineNbr;
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	private Product product;
	private int quantity;
	private double unitPrice;

	/**
	 * Parameterized constructor of OrderItem Class
	 * 
	 * @param int     type of the line number
	 * @param Product type of the product
	 * @param int     type of the quantity
	 */
	public OrderItem(int lineNbr, Product product, int quantity) {
		super();
		this.lineNbr = OrderItem.lineNumber++;
		this.product = product;
		this.quantity = quantity;
	}

	//returns the total amount of items
	public double getItemTotal() {
		
		return getUnitPrice() * getQuantity();
	}

	/**
	 * @return int type of the line number
	 */
	public int getLineNbr() {
		return lineNbr;
	}

	/**
	 * @return Product type of the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @return int type of the the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	public double getTax() {
		// TODO Hardware class implements Taxable interface, so print this if the
		// product is a Hardware object
		double taxedItem = 0;

		if (getProduct() instanceof Taxable) {
			taxedItem = ((Taxable) getProduct()).getTax(getItemTotal());
		}

		return taxedItem;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	public double getUnitPrice() {
		
	return this.unitPrice;
	}

}
