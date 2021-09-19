/**
 * 
 */
package com.renova.egitim;

/**
 * @author misanty
 *This is an interface
 *is specified on the UML diagram by purple color and dotted line and hollow arrow.
 */
public interface Taxable {
	//Since this is an interface all variables are static by default
	double TAX_RATE = 0.18;

//This will calculate the price after taxes
	public double getTax(double amount);

}
