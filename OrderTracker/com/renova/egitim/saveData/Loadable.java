package com.renova.egitim.saveData;
import com.renova.egitim.Customer;

import java.io.IOException;

import javax.swing.DefaultListModel;

public interface Loadable {

	public DefaultListModel<Customer> getCustomerList();

	public Customer findCustomerById(int id);

	public void add(Customer customer);

	int count();

	boolean isEmpty();

	int returnID(Customer customer);

	void serialize() throws IOException;

	void setFile(String fileName);

}
