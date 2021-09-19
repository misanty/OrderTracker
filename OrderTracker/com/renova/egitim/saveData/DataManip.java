package com.renova.egitim.saveData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import javax.swing.DefaultListModel;

import com.renova.egitim.Company;
import com.renova.egitim.Customer;
import com.renova.egitim.Hardware;
import com.renova.egitim.Individual;
import com.renova.egitim.Manual;
import com.renova.egitim.Product;
import com.renova.egitim.Software;
import com.renova.egitim.Order;

public class DataManip {

	private Customer customer;
	private Product product;
	private Order prOrder;
	private Loadable loadable;
	private static DefaultListModel<Product> produDefaultListModel = new DefaultListModel<Product>();
	private static Scanner scanner = new Scanner(System.in);

	public Product initilizeProduct(Product type) {
		return product = type;

	}

	public Customer initilizeCutomer(Customer tyCustomer) {
		return customer = tyCustomer;
	}

	public Order initilizeOrder(Order tyCustomer) {
		return prOrder = tyCustomer;
	}

	public DataManip(LoadRunData data) {
		this();
		if (loadable == null) {
			loadable = new LoadRunData();
		}
		if(data != null) {
			loadable = data;
		}
	}

	public DataManip() {
		
	}

	public boolean addCustomer() throws IOException {
		boolean flag = true;
		System.out.printf("[0] Şirket%n[1] Şahıs%n");
		String typeString = scanner.nextLine();

		if ("0".equalsIgnoreCase(typeString)) {

			customer = new Company();
			customer.changeFieldValue("name", readWriteFieldName("isim"));
			customer.changeFieldValue("phone number", readWriteFieldName("telefon numarası"));
			customer.changeFieldValue("address", readWriteFieldName("adres"));
			Company company = (Company) customer;
			company.setContact(readWriteFieldName("İletişim Bilgileri"));
			company.setDiscount(10);
			loadable.add(customer);
			System.out.print(company.toString());

		} else if ("1".equalsIgnoreCase(typeString)) {
			String nameString = readWriteFieldName("isim");
			String phoneString = readWriteFieldName("telefon");
			customer = new Individual(nameString, phoneString);
			customer.setAddress(readWriteFieldName("ev adresi"));
			Individual individual = (Individual) customer;

			individual.setLicNumber(readWriteFieldName("kimlik numarası"));
			loadable.add(customer);
			loadable.serialize();
			System.out.print(customer.toString());

		} else {
			flag = false;
		}
		if (flag) {
			//DataSerialization.serialize(loadable, "orderPlacement.ser");
			loadable.serialize();
		}
		
		return flag;
	}

	public void addOrder() {

	}

	public boolean addProduct() throws IOException {

		boolean flag = true;

		System.out.printf("[0] Donanım%n[1] Yazılım%n[2] Kılavuz%n");
		String typeString = scanner.nextLine();

		switch (typeString.trim().toLowerCase()) {
		case "0":
			int i = Integer.parseInt(readWriteFieldName("garanti periodu"));
			product = new Hardware(i);
			product.setName(readWriteFieldName("ürün ismi"));

			product.setRetailPrice(Double.parseDouble(readWriteFieldName("perakende fiyatı")));
			Hardware hardware = (Hardware) product;
			hardware.getTax(Double.parseDouble(readWriteFieldName("vergi öncesi fiyatı")));
			produDefaultListModel.addElement(hardware);
			System.out.println(hardware.getDescription());

			break;
		case "1":

			product = new Software(readWriteFieldName("lisans numarası"));

			product.setName(readWriteFieldName("ürün ismi"));

			product.setRetailPrice(Double.parseDouble(readWriteFieldName("perakende fiyatı")));
			Software software = (Software) product;

			produDefaultListModel.addElement(software);
			System.out.println(software.getDescription());
			break;
		case "2":
			product = new Manual(readWriteFieldName("Yayımcı"));

			product.setName(readWriteFieldName("ürün ismi"));

			product.setRetailPrice(Double.parseDouble(readWriteFieldName("perakende fiyatı")));
			Manual manual = (Manual) product;

			produDefaultListModel.addElement(manual);
			System.out.println(manual.getDescription());

			break;
		default:
			flag = false;
			break;
		}
		if (flag) {
			loadable.serialize();
			
			//DataSerialization.serialize(product, "orderPlacement.ser");
		}
		return flag;
	}
	
	void serialize( ) {
		
	}
	
	public boolean retrieveProducts() throws ClassNotFoundException, IOException {
 DataSerialization.deserialize("orderPlacement.ser");
		
	
			return true;
	}
		
	
		
	

	private String readWriteFieldName(String fieldName) {
		System.out.print(fieldName + " giriniz: ");
		return scanner.nextLine();
	}

}
