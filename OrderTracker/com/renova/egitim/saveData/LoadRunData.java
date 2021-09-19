package com.renova.egitim.saveData;

import java.io.IOException;
import javax.swing.DefaultListModel;

import com.renova.egitim.Customer;

public class LoadRunData implements Loadable {

	private  DefaultListModel<Customer> defaultListModel;
	private static LoadRunData data; 
	private static String fileName;
	
	
	public static Loadable  getInstance() {
		if (data  == null) {
			data = new LoadRunData();
		}
		return data;
	}

	
	
	/**
	 * 
	 */
	public LoadRunData() {
		this.defaultListModel = new DefaultListModel<Customer>();
	}



	/***
	 * returns the customer
	 */
	@Override
	public DefaultListModel<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return defaultListModel;
	}


//Returns by specified id if it exists null if it's not
	@Override
	public Customer findCustomerById(int id) {
		
		return isValidIndex(id) ? defaultListModel.get(id) : null;
	}



	@Override
	public void add(Customer customer) {
		if(customer != null)
		{
			defaultListModel.addElement(customer);
		}
		
	}



	@Override
	public int returnID(Customer customer) {

	    for (int i = 0; i < getCustomerList().size(); i++) {
	            if (getCustomerList().get(i).equals(customer)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	



//returns the size of the defaultList
	@Override
	public int count() {
	return  defaultListModel.size();
	}

	//returns whether it's empty or not
	@Override
	public boolean isEmpty() {
	return defaultListModel.isEmpty();
	}

	
	@Override
	public void serialize() throws IOException {
		 if (LoadRunData.fileName != null) {

	            DataSerialization.serialize(defaultListModel,LoadRunData.fileName);

	        }
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setFile(String fileName) {
		LoadRunData.fileName = fileName;
		 try
	        {

	           defaultListModel = (DefaultListModel<Customer>) DataSerialization.deserialize(LoadRunData.fileName);

	        } catch (ClassNotFoundException | IOException ignored) {

	        }
		
	}
	
	private boolean isValidIndex(int id) {
        return (id >= 0 && id < defaultListModel.size());
    }
	
	
	
	
	

}
