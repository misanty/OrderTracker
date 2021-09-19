/**
 * 
 */
package com.renova.egitim;

import java.io.Serializable;
import java.util.Date;

import javax.swing.DefaultListModel;

/**
 * @author misanty
 *
 */
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	private Customer customer;
	private static int nextOrderId = 11;
	private int id;
	private DefaultListModel<OrderItem> items;
	private Date orderDate;
	private double orderTotal;
	

	/**
	 * Default non-parameterized constructor
	 */
	public Order() {
		Order.nextOrderId++;
		setId(nextOrderId);
		items = new DefaultListModel<OrderItem>();
		
	}

	/**
	 * Overloaded Constructor
	 * 
	 * @param Customer type of customer
	 * @param int      type of id
	 * @param Date     type of orderDate
	 */
	public Order(Customer customer, int id, Date orderDate) {
		this();
		this.customer = customer;
		this.id = id;
		this.orderDate = null != orderDate ? orderDate : new Date();
	}

	/**
	 * Adds order items if not null
	 * @param OrderItem type of item
	 */
	public void addOrderItem(OrderItem item) {
		if (item != null) {
			this.items.addElement(item);
		}

	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the items
	 */
	public DefaultListModel<OrderItem> getModel() {
		return items;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @return the orderTotal
	 */
	public double getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(int id) {
		this.id = id;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(DefaultListModel<OrderItem> items) {
		this.items = items;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", id=" + id + ", items=" + items + ", orderDate=" + orderDate
				+ ", orderTotal=" + orderTotal + "]";
	}


	
}
