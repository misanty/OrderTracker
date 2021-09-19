package com.renova.egitim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.renova.egitim.saveData.*;

public class Main {

	static final String[] liStrings = { "[1] Yeni Kayıt Ekle", "[2] Sipariş Ver", "[3] Ürünleri Görüntüle",
			"[4] Ürün Ekle", "[5] Çıkış" };
	static Scanner scanner;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		selectMenu();
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Product> products = new ArrayList<Product>(); Product
		 * productHardware = new Hardware(18); productHardware.setId(0);
		 * productHardware.setName("testHardwareName");
		 * 
		 * Product prManualProduct = new Manual("Test Manual Publisher");
		 * prManualProduct.setId(1); prManualProduct.setRetailPrice(1000);
		 * prManualProduct.setName("Manual Wheicle Stuff"); Product prSoftwareProduct =
		 * new Software("12XSHGD12312AGKA"); prSoftwareProduct.setId(2);
		 * prSoftwareProduct.setName("OMG Software");
		 * prSoftwareProduct.setRetailPrice(555);
		 * 
		 * products.add(productHardware); products.add(prManualProduct);
		 * products.add(prSoftwareProduct);
		 * 
		 * for (Product product : products) {
		 * System.out.println(product.getDescription()); }
		 * 
		 * System.out.println("***************************");
		 * 
		 * OrderItem item = new OrderItem(11, productHardware, 2); item.getTax();
		 * OrderItem item2 = new OrderItem(12, prManualProduct, 3); OrderItem item3 =
		 * new OrderItem(13, prSoftwareProduct, 6);
		 * 
		 * Order order = new Order(); order.addOrderItem(item3);
		 * order.addOrderItem(item2); order.addOrderItem(item);
		 * 
		 * Customer customer1 = new Individual("Doeechii", "12312314");
		 * 
		 * customer1.setAddress("Brooklyn 12A 23131st"); Customer customer2 = new
		 * Company("Ricola", "850121212", 5);
		 * 
		 * customer2.setAddress("Sugary Street 1231A");
		 * 
		 * for (int i = 0; i < order.getModel().getSize(); i++) {
		 * 
		 * System.out.println(order.getModel().get(i).getProduct().getDescription());
		 * 
		 * }
		 */
	}

	public static String selectMenu() throws IOException, ClassNotFoundException  {
		boolean flag = true;
		DataManip data;

		while (flag) {

			switch (printMenu()) {
			case "1":

				data = new DataManip(new LoadRunData());
				
				data.addCustomer();
				
				
				break;

			case "2":
				break;
			case "3":
				data = new DataManip();
				data.retrieveProducts();
				break;
			case "4":
				data = new DataManip();
				data.addProduct();
				data.retrieveProducts();

				break;
			case "5":
				flag = false;
				break;

			default:
				break;
			}

		}

		for (int i = 0; i < liStrings.length; i++) {
			System.out.println(liStrings[i]);
		}
		return scanner.nextLine();

	}

	public static String printMenu() {
		scanner = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");

		for (int i = 0; i < liStrings.length; i++) {
			System.out.println(liStrings[i]);
		}
		return scanner.nextLine();

	}

}
